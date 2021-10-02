/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Paul Kelly
 */

package baseline;

import static java.lang.Math.log;
import java.util.Scanner;

public class Solution26 {

    public static final Scanner input = new Scanner(System.in);

    private static int userInputBalance() {
        //Scan user balance
        System.out.print("What is your balance? ");
        return input.nextInt();
    }

    private static double userInputAPR() {
        //Scan user APR (as a percentage)
        System.out.print("What is the APR on your card (as a percentage)? ");
        return input.nextDouble();

    }

    private static int userInputMonthlyPayment() {
        //Scan user monthly payment
        System.out.print("What is the monthly payment you can make? ");
        return input.nextInt();
    }

    public static int monthsToPayOffCreditCard(int balance, double APR, int monthlyPayment) {
        //Use the formula to calculate the number of months to pay off a credit card.
        return (int) Math.ceil(-(1.0/30.0) * log(1 + (balance*1.0)/(monthlyPayment*1.0)
                * (1 - Math.pow(1 + ((APR*0.01)/365), 30))) / log(1 + (APR*0.01)/365));
    }

    private static void outputStatement(double monthsToPayOffCreditCard) {
        //Output the number of months it will take for the user to pay off their credit card.
        System.out.printf("It will take %.0f months to pay off this card.\n", monthsToPayOffCreditCard);
    }

    public static void main(String[] args) {
        //Call userInput functions
        int b = userInputBalance();
        double i = userInputAPR();
        int p = userInputMonthlyPayment();
        //Call monthsToPayOffCreditCard function
        int n = monthsToPayOffCreditCard(b, i, p);
        //Call outputStatement function
        outputStatement(n);
    }
}