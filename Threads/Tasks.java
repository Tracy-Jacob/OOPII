package com.jacob.tracy.threads.sandbox;

/**
 * Created by jacobtracy on 12/3/15.
 */
public class Tasks {
    public static void turnOn() {
        try {
            String name = Thread.currentThread().getName();
            System.out.println(name + ": Has turned on the engines for it's ship");
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void releaseBrakes(){
        try{
            String name1 = Thread.currentThread().getName();
            System.out.println(name1 + ": Has released the brakes for it's ship");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void takeOff(){
        String name2 = Thread.currentThread().getName();
        System.out.println(name2 + ": Has Taken off");
    }

    public static void finishedRace() {
        try {
            String name3 = Thread.currentThread().getName();
            System.out.println(name3 + ": Has finished the race");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void shutDown(){
        System.out.println("Attempt to shut down threads");

    }
}
