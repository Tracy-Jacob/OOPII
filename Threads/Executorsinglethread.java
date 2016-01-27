package com.jacob.tracy.threads.sandbox;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by jacobtracy on 12/7/15.
 */
//this is a single thread executor

public class Executorsinglethread {
    public static void main (String [] Args){
        ExecutorService start = Executors.newSingleThreadExecutor();
        //ExecutorService start = Executors.newSingleThreadExecutor(null);
        start.submit(() -> {
            String Threadname = Thread.currentThread().getName();
            System.out.println("This is the thread: " + Threadname);
        });

        try{
            System.out.println("attempt to shutdown executor");
            start.shutdown();
            start.awaitTermination(1, TimeUnit.SECONDS);
        }catch (InterruptedException ex){
            System.err.println("Tasks intereupted");
        }
        finally {
            if(!start.isTerminated()) {
                System.err.println("Cancel tasks");
            }
            start.shutdown();
            System.out.println("Shutdown complete");
        }

    }
}
