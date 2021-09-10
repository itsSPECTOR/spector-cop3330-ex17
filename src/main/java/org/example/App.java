package org.example;
import java.util.Scanner;

/**
 *
 * UCF COP3330 Fall 2021 Assignment 17 Solution
 * Copyright 2021 Reese Spector
 *
 */

public class App
{
    public static void main( String[] args )
    {
        // scanner
        Scanner input = new Scanner(System.in);

        //declare variables
        String strGender, strWeight, ounces, strTime;
        double userGender = 0, userWeight = 0,  userOunces = 0, userTime = 0, flag = 0;

            // get gender
            while (flag == 0) {
                System.out.print("Enter a 1 is you are male or a 2 if you are female: ");
                strGender = input.nextLine();
                try {
                    userGender = Double.parseDouble(strGender);
                    flag = 1;
                }
                catch (NumberFormatException ex) {}
            } flag = 0; //reset flag

            //get alchohol ounces
            while (flag == 0) {
                System.out.print("How many ounces of alcohol did you have? ");
                ounces = input.nextLine();
                try {
                    userOunces = Double.parseDouble(ounces);
                    flag = 1;
                }
                catch (NumberFormatException ex) {}
            } flag = 0; //reset flag

            //get weight
            while (flag == 0) {
                System.out.print("What is your weight, in pounds? ");
                strWeight = input.nextLine();
                try {
                    userWeight = Double.parseDouble(strWeight);
                    flag = 1;
                }
                catch (NumberFormatException ex) {}
            } flag = 0; //reset flag

            //since last drink
            while (flag == 0) {
                System.out.print("How many hours has it been since your last drink?");
                strTime = input.nextLine();
                try {
                    userTime = Double.parseDouble(strTime);
                    flag = 1;
                }
                catch (NumberFormatException ex) {}
            }

        //math
        final double adr = userGender == 1 ? 0.73 : 0.66; //alcohol-distribution-ratio
        double bac = (userOunces * 5.140 * adr / userWeight) - (.015 * userTime);

        //print bac
        System.out.print("Your BAC is " + bac);

        //print legality
        if (bac >= 0.08){
            System.out.print("\nIt is not legal for you to drive.\n");
        } else {
            System.out.print("It is legal for you to drive.\n");
        }
    }
}
