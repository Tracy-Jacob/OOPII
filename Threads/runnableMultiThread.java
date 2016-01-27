package com.jacob.tracy.threads.sandbox;

/**
 * Created by jacobtracy on 12/3/15.
 */
public class runnableMultiThread implements Runnable {
    public static void main (String [] Args){

        runnableMultiThread makeItSo = new runnableMultiThread();

        Thread task1 = new Thread(makeItSo);
        Thread task2 = new Thread(makeItSo);
        Thread task3 = new Thread(makeItSo);
        Thread task4 = new Thread(makeItSo);
        Thread task5 = new Thread(makeItSo);


        task1.start();
        task2.start();
        task3.start();
        task4.start();
        task5.start();

    }

    @Override
    public void run() {
        Tasks.turnOn();
        Tasks.releaseBrakes();
        Tasks.takeOff();
        Tasks.finishedRace();
    }

}
