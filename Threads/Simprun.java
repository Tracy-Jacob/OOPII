package com.jacob.tracy.threads.sandbox;

/**
 * Created by jacobtracy on 12/8/15.
 */
public class Simprun implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        try{
            for (int i=0; i<=10; i++){
                System.out.println("something " + Thread.currentThread().getName() + " = " + i);
                Thread.sleep(10);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Finished");
    }
}
