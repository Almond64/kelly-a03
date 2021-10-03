/*
 * UCF COP3330 Fall 2021 Assignment 3 Solutions
 * Copyright 2021 paul kelly
 */

package baseline;

import java.util.Scanner;

public class Solution31 {

    public static final Scanner input = new Scanner(System.in);

    private static int userAge() {
        //Prompt user for their age
        System.out.print("Enter your age: ");
        //Scan user age
        return input.nextInt();
    }

    private static int userHeartRate() {
        //prompt user for their heart rate
        System.out.print("Enter your resting heart rate: ");
        //Scan user heart rate
        return input.nextInt();
    }

    public static void karvonenHeartRate(int userAge, int userHeartRate) {
        //Output the user's resting pulse and age followed by a newline
        System.out.printf("Resting Pulse: %d        Age: %d\n", userHeartRate, userAge);
        /*
        Generate a table with Intensity on the left and Rate on the right.
        Intensity ranges from 55% to 95%
        Use the Karvonen Heart Rate formula to determine the target heart rate.
        Generate the table using a for loop that increments intensity by 5%
        And don't forget to code the formula
        */
        System.out.println("Intensity     | Rate\n------------|--------");
        for (int i = 55; i < 96; i += 5) {
            System.out.print(i + "%" + "        | "
                    + ((((220 - userAge) - userHeartRate) * i)
                    + userHeartRate) + " bpm\n");
        }

    }

    public static void main(String[] args) {
        //Call getter functions
        int age = userAge();
        int rate = userHeartRate();
        //calculate Karvonen Heart Rate
        karvonenHeartRate(age, rate);
    }

}
