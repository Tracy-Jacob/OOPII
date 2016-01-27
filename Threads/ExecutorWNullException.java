package com.jacob.tracy.threads.sandbox;

import java.util.concurrent.*;

/**
 * Created by jacobtracy on 12/3/15.
 */
public class ExecutorWNullException {
    public static void main (String [] Args) {
        System.out.println("This will throw a null pointer Exception");
        try {

            ThreadFactory factory = null;
            ThreadFactory factory1 = new ThreadFactory() {
                @Override
                public Thread newThread(Runnable r) {
                    return null;
                }
            };
            int threads = -1;
            int threads1 = 5;

            ExecutorService makeItSo = Executors.newFixedThreadPool(threads1, factory1);
            makeItSo.submit(() -> {
                String name = Thread.currentThread().getName();
                System.out.println("Mr. Zulu, Make it so!" + name);

            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}






