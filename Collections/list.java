package com.jacob.tracy;

import java.util.*;

/**
 * Created by jacobtracy on 10/26/15.
 */

//albert is the name of the smart guy
public class list {
    public static void main(String[] args){

        ArrayList listOfFood = new ArrayList();
        ArrayList listOfFoodBad1 = new ArrayList();
        ArrayList listOfFoodBad2 = new ArrayList();

        //Happy path***************************************************************************************************
        //add a null value for a nasty path
        try {
            listOfFood.add("null");
            listOfFood.add(1);
            listOfFood.add("Spaghetti");
            listOfFood.add("Apple");
            listOfFood.add("Lasagna");
            listOfFood.add("Apple pie");

            int i[] = {2,4};

            for(int j = 0; j < i.length; j++ ){
                listOfFood.remove(i[j]);
            }
            System.out.println("*---------------------------------*");
            System.out.println("Print ArrayList");
            System.out.println(listOfFood);
            System.out.println("*---------------------------------*");
            System.out.println();


        } catch (Exception e){
            System.out.println("*---------------------------------*");
            System.out.println("There was something wrong");
            System.out.println("*---------------------------------*");
            System.out.println();
        }


        //Nasty path remove a value that doesnt exist
        try {
            listOfFoodBad1.add("null");
            listOfFoodBad1.add(1);
            listOfFoodBad1.add("Spaghetti");
            listOfFoodBad1.add("Apple");
            listOfFoodBad1.add("Lasagna");
            listOfFoodBad1.add("Apple pie");

            int i[] = {7};

            for(int j = 0; j < i.length; j++ ){
                listOfFoodBad1.remove(i[j]);
            }
            System.out.println("*---------------------------------*");
            System.out.println(listOfFoodBad1);
            System.out.println("*---------------------------------*");
            System.out.println();

        } catch (Exception e){
            System.out.println("*----------------------------------------------------------*");
            System.out.println("Print Nasty Path for ArrayList");
            System.out.println("ArrayIndexOutOFBoundsException: -1");
            System.out.println("You can't remove a space in the array that doesnt exist");
            System.out.println("*----------------------------------------------------------*");
            System.out.println();
        }

        //Nasty path add an index before 0*****************************************************************************
        try {
            listOfFoodBad2.add("null");
            listOfFoodBad2.add(1);
            listOfFoodBad2.add("Spaghetti");
            listOfFoodBad2.add("Apple");
            listOfFoodBad2.add("Lasagna");
            listOfFoodBad2.add("Apple pie");


            int i[] = {1};

            for(int j = 0; j < i.length; j--){
                listOfFoodBad2.add(i[j]);
            }
            System.out.println("*---------------------------------*");
            System.out.println(listOfFoodBad2);
            System.out.println("*---------------------------------*");
            System.out.println();

        } catch (Exception e){
            System.out.println("*---------------------------------------*");
            System.out.println("Print Nasty Path for ArrayList");
            System.out.println("You can't add an array space before 0");
            System.out.println("*---------------------------------------*");
            System.out.println();

        }

        //This will replace the last value in the Linked list*********************************************************
        List<String> namesbad = new LinkedList<>();
        try {
            namesbad.add("Amy");
            namesbad.add("Jacob");
            namesbad.add("Eric");
            namesbad.add("Jackie Robinson");

            namesbad.set(3,"Frank");

            System.out.println("*-------------------------------*");
            System.out.println(namesbad);
            System.out.println("*-------------------------------*");
            System.out.println();

        }catch (Exception e){
            System.out.println("Can not add a value to an index that does not exist");
            System.out.println("Something went wrong");
            System.out.println();
        }

        //this tries to remove a value from index 0 and remove an index based on the object Steve.*********************
        List<String> namesbad2 = new LinkedList<>();
        try {
            namesbad2.add("Amy");
            namesbad2.add("Jacob");
            namesbad2.add("Eric");
            namesbad2.add("Jackie Robinson");

            namesbad2.remove("Steve");

            System.out.println("*-------------------------------*");
            System.out.println("This tries to remove an index with the value: Steve");
            System.out.println(namesbad2);
            System.out.println("*-------------------------------*");
            System.out.println();

        }catch (Exception e){
            System.out.println("Can not add a value to an index that does not exist");
            System.out.println("Something went wrong");
            System.out.println();
        }

        //This tries to add a value to an index that does not exist within the Linked list****************************
        List<String> names = new LinkedList<>();
        try {
            names.add("Amy");
            names.add("Jacob");
            names.add("Eric");
            names.add("Jackie Robinson");

            names.set(9,"Frank");

            System.out.println("*-------------------------------*");
            System.out.println(names);
            System.out.println("*-------------------------------*");
            System.out.println();

        }catch (Exception e){
            System.out.println("*-------------------------------------------------*");
            System.out.println("Can not add a value to an index that does not exist");
            System.out.println("Something went wrong");
            System.out.println("*-------------------------------------------------*");
            System.out.println();
        }

        //Happy path for MAP********************************************************************************************
        Map treeMapOfPeople = new TreeMap();
        try {
            treeMapOfPeople.put("key1", "Tom Cruise");
            treeMapOfPeople.put("key2", "Penelope Cruise");
            treeMapOfPeople.put("key2", "Anne Hathaway");
            treeMapOfPeople.put("key4", "Matt Damon");
            treeMapOfPeople.put("key5", "Frank Zappa");
            treeMapOfPeople.put("key6", "Heath Ledger");

            System.out.println(treeMapOfPeople);
            System.out.println();

        }catch (Exception e){
            System.out.println();
        }

        //Nasty path for Map********************************************************************************************
        Map treeMapOfPeoplebad = new TreeMap();
        try {
            treeMapOfPeoplebad.put("key1", "Tom Cruise");
            treeMapOfPeoplebad.put("key2", "Penelope Cruise");
            treeMapOfPeoplebad.put("key2", "Anne Hathaway");
            treeMapOfPeoplebad.put("key4", "Matt Damon");
            treeMapOfPeoplebad.put("key5", "Frank Zappa");
            treeMapOfPeoplebad.put("key6", "Heath Ledger");
            treeMapOfPeoplebad.put(null,null);

        }catch (Exception e){
            System.out.println("*-------------------------------------------------------------------------*");
            System.out.println("Prints Nasty path for TreeMap");
            System.out.println("You can not insert a null value for key and the value: NullPointerException");
            System.out.println("*-------------------------------------------------------------------------*");
            System.out.println();
        }

        //Nasty path for Map try to insert a value with a null key******************************************************
        Map treeMapOfPeoplebad2 = new TreeMap();
        try {
            treeMapOfPeoplebad2.put("key1", "Tom Cruise");
            treeMapOfPeoplebad2.put("key2", "Penelope Cruise");
            treeMapOfPeoplebad2.put("key2", "Anne Hathaway");
            treeMapOfPeoplebad2.put("key4", "Matt Damon");
            treeMapOfPeoplebad2.put("key5", "Frank Zappa");
            treeMapOfPeoplebad2.put("key6", "Heath Ledger");
            treeMapOfPeoplebad2.put(1,"Robert Downey jr.");

        }catch (Exception e){
            System.out.println("*-------------------------------------------------------------------------*");
            System.out.println("Prints Nasty path for TreeMap");
            System.out.println("You can not insert an Interger for key: ClassCastException");
            System.out.println("*-------------------------------------------------------------------------*");
            System.out.println();
        }

        //happy path****************************************************************************************************
        Set primeNumbers = new TreeSet();
        try{
            primeNumbers.add(2);
            primeNumbers.add(3);
            primeNumbers.add(5);
            primeNumbers.add(7);
            primeNumbers.add(11);
            primeNumbers.add(13);
            primeNumbers.add(17);

            System.out.println("*-------------------------------*");
            System.out.println("Prints the TreeSet of prime numbers");
            System.out.println(primeNumbers);
            System.out.println("*-------------------------------*");
            System.out.println();

        }catch (Exception e) {
            System.out.println("Something went wrong");
        }


        Set primeNumbersbad = new TreeSet();
        //nasty path- This will try to add a null value into the Set****************************************************
        try{
            primeNumbersbad.add(2);
            primeNumbersbad.add(17);
            primeNumbersbad.add(3);
            primeNumbersbad.add(5);
            primeNumbersbad.add(7);
            primeNumbersbad.add(11);
            primeNumbersbad.add(13);
            primeNumbersbad.add(3);
            primeNumbersbad.add(null);

            System.out.println(primeNumbersbad);

        }catch (Exception e) {
            System.out.println("*----------------------------------------*");
            System.out.println("You can not insert a null value into a Set");
            System.out.println("*----------------------------------------*");
            System.out.println();
        }

        Set primeNumbersbad2 = new TreeSet();
        //nasty path- This will try to add a null value into the Set****************************************************
        try{
            primeNumbersbad2.add(2);
            primeNumbersbad2.add(17);
            primeNumbersbad2.add(3);
            primeNumbersbad2.add(5);
            primeNumbersbad2.add(7);
            primeNumbersbad2.add(11);
            primeNumbersbad2.add(13);
            primeNumbersbad2.add(3);
            primeNumbersbad2.add(13);
            primeNumbersbad2.add(13);
            primeNumbersbad2.add(5);
            primeNumbersbad2.add(2);

            System.out.println("*----------------------------------------*");
            System.out.println("This sorts the Set and removes all values that are multiples");
            System.out.println(primeNumbersbad2);
            System.out.println("*----------------------------------------*");
            System.out.println();


        }catch (Exception e) {
            System.out.println();
        }

        //possible nasty path with inputting a null value and key.
        HashMap<String, Integer> keyGun = new HashMap();

            try {
                keyGun.put("1", 1);
                keyGun.put(null, null);
                keyGun.put("2", 1);
                keyGun.put("3", 2);
                keyGun.put("4", 3);
                keyGun.put("5", 4);
                keyGun.put("", null);

                System.out.println(keyGun);
                System.out.println();
            }catch (Exception e){
                System.out.println("*----------------------------------------*");
                System.out.println("Possible null pointer expression");
                System.out.println("*----------------------------------------*");
                System.out.println();
            }

        HashMap keyGun1 = new HashMap();

        //Happy path
        try {
            keyGun1.put("key6", "Wyndham");
            keyGun1.put("Key5", "Barreta");
            keyGun1.put("key1", "Colt");
            keyGun1.put("key2", "Winchester");
            keyGun1.put("key3", "Benelli");
            keyGun1.put("key4", "Smith & Wesson");
            keyGun1.put("", "");
        }catch (Exception e){
            System.out.println("This should be fine");
        }

        //Nasty path with replace
        try {
            HashMap<String, Integer> mergeMap = new HashMap();
            mergeMap.putAll(keyGun);
            mergeMap.putAll(keyGun1);

            //This wont work unless you select an existing key and value
            mergeMap.replace("5",3,0);

            System.out.println(mergeMap);
        } catch (Exception e){
            e.printStackTrace();
        }


    }
}
