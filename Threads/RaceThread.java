package com.jacob.tracy.threads.sandbox;

/**
 * Created by jacobtracy on 12/2/15.
 */
public class RaceThread {
    public static void main (String[] Args){

        Racers racer = new Racers();

        Thread speedyThread = new Thread(racer,"Speedy Gonzales");
        Thread herbieThread = new Thread(racer,"Herbie the Car");


        speedyThread.setPriority(speedyThread.MAX_PRIORITY);
        try {
            speedyThread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        speedyThread.start();
        herbieThread.start();
        //speedyThread.stop();

        //pass null for the runnable
        try{
            Thread racer1 = new Thread(racer, null);
            racer1.start();

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
