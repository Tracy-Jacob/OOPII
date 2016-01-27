package com.jacob.tracy.threads.sandbox;

/**
 * Created by jacobtracy on 12/7/15.
 */
public class RaceCondition {
    private static int number = 0;
    //private static int number2 = 0;

    //public static void inNumber(){
    public static synchronized void inNumber(){
        number++;
    }

//    //public static void inNumber2(){
//        number2++;
//    }

    public static void main (String [] Args) throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i<700;i++){
                    inNumber();
                    //inNumber2();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i<500;i++){
                    inNumber();
                    //inNumber2();
                }
            }
        });
        thread1.start();
//        thread1.interrupt();
//        try {
//            thread1.sleep(100);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        thread2.start();

        try{
            thread2.join();
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("The first number is: " + number);
        //System.out.println("The first number is: " + number2);
    }
}
