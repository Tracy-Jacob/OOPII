package com.jacob.tracy.threads.sandbox;

/**
 * Created by jacobtracy on 12/2/15.
 */
public class Racers implements Runnable{

    public static String winner;
    public void runRace() {

        for (int miles = 1; miles <= 100; miles++) {
            try {
                System.out.println("miles completed by: " + Thread.currentThread().getName() + " is: " + miles + " miles.");
            } catch (Exception e) {
                e.printStackTrace();
            }
            boolean isRaceWon = this.findIfRaceIsWon(miles);
            if (isRaceWon) {
                break;
            }
        }
    }

//Race condition to determine winner fo the race!
    private boolean findIfRaceIsWon(int totalDistanceCovered){
        boolean isRaceWon = false;
        if((Racers.winner==null)&&(totalDistanceCovered==100)){
            String winnerName=Thread.currentThread().getName();
            Racers.winner=winnerName; //setting the winner name)
            System.out.println("The winner is: "+Racers.winner + "!!!");
            isRaceWon=true;
        }
        else if(Racers.winner==null){
            isRaceWon=false;
        }
        else if(Racers.winner==null){
            isRaceWon=true;
        }
        return isRaceWon;
    }

    @Override
    public void run() {
        this.runRace();
    }
}
