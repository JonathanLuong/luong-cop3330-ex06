package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jonathan Luong
 */

import java.util.Scanner;
import java.util.Calendar;

public class App
{
    public static void main( String[] args )
    {
        Scanner reader = new Scanner(System.in); // Creates reader

        System.out.println( "What is your current age? " );
        String age = reader.nextLine();

        System.out.println( "At what age would you like to retire?" );
        String ageR = reader.nextLine();

        int year = Calendar.getInstance().get(Calendar.YEAR);


        int num1 = Integer.parseInt(age);
        int num2 = Integer.parseInt(ageR);
        int num3 = num2 - num1;
        int retirementYear = year + num3;

        System.out.println("You have " + num3 + " years left until you can retire.");
        System.out.println("It's " + year + ", so you can retire in " + retirementYear + ".");
    }
}
