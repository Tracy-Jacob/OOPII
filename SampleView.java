package com.jacob.tracy.mvc.view;

import com.jacob.tracy.mvc.controller.*;

import java.util.Scanner;

/**
 * Created by jacobtracy on 10/22/15.
 */
public class SampleView {
    public static void main (String[] args){

        String name;
        String nameReq;
        int age;
        int grade;

        SampleController control = new SampleController();

        Scanner scan = new Scanner(System.in);

            System.out.println("Please enter a name");
            name = scan.nextLine();

            System.out.println("Please enter an age");
            age = scan.nextInt();



        control.storeUserInfo(name, age);

        System.out.println("Name:" + name + " Age:" + age );

        Scanner scan2 = new Scanner(System.in);

        System.out.println("Please enter a name to check for:");
        nameReq = scan2.nextLine();

        //System.out.println("Please enter an age to check for:");
        //age = scan.nextInt();

        //System.out.println("Please enter an grade to check for:");
        //grade = scan.nextInt();

        //nameReq = "Steve";
        System.out.println(control.getUserInfo(nameReq));
    }



}
