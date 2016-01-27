package com.jacob.tracy.threads.sandbox;

/**
 * Created by jacobtracy on 12/8/15.
 */
public class crosslock extends Simprun{

    public static Object lock1 = new Object();
    public static Object lock2 = new Object();

    public static void main (String [] Args){
        Simprun simpLock1 = new Simprun();
        Thread t1lock = new Thread();
        t1lock.start();

        Simprun2 simplock2 = new Simprun2();
        Thread t2lock = new Thread();
        t2lock.start();
    }


    private static class Simprun{
        public void run(){
            try{
                synchronized (lock1){
                    System.out.println("waiting " + Thread.currentThread().getName() );

                    Thread.sleep(10);
                synchronized (lock2){
                    System.out.println("waiting " + Thread.currentThread().getName() );
                    Thread.sleep(10);
                }
            }} catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static class Simprun2{
        public void run(){
            try{
                synchronized (lock2){
                    System.out.println("waiting " + Thread.currentThread().getName() );

                    Thread.sleep(10);
                    synchronized (lock1){
                        System.out.println("waiting " + Thread.currentThread().getName() );
                        Thread.sleep(10);
                    }
                }} catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
