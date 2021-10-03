/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Paul Kelly
 */

package baseline;

import java.util.Scanner;

public class Solution28 {

    public static final Scanner input = new Scanner(System.in);

    public static int addNumbers() {
        int[] arr = new int[5];
        int total = 0;
        //for i=0 to i<5, prompt the user to enter a number, scan user input, and add input to total
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number: ");
            arr[i] = input.nextInt();
            total += arr[i];
        }
        //after loop has executed, return total
        return total;
    }

    public static void main(String[] args) {
        int sum = addNumbers();
        System.out.printf("The total is %d.", sum);
    }

}
