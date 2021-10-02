/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Paul Kelly
 */

package baseline;

import static java.lang.Math.log;
import java.util.Scanner;

public class Solution26 {

    public static final Scanner input = new Scanner(System.in);

    private int userInputBalance() {
        //Scan user balance
        System.out.print("What is your balance? ");
        return input.nextInt();
        //Scan user APR
        //Scan user monthly payment
    }

    private int userInputMonthlyPayment() {
        //Scan user balance
        //Scan user APR
        System.out.print("What is your APR on the card (as a percent)? ");
        return input.nextInt();
        //Scan user monthly payment
    }

    private int userInputAPR() {
        //Scan user balance
        //Scan user APR
        //Scan user monthly payment
        System.out.print("What is the monthly payment you can make? ");
        return input.nextInt();

    }

    public int monthsToPayOffCreditCard(int balance, int APR, int monthlyPayment) {
        //Use the formula to calculate the number of months to pay off a credit card.
        return (int) (-(1/30) * log(1 + balance/monthlyPayment *(1 - (1 + APR)^30)) / log(1 + APR));
    }

    private void outputStatement(int monthsToPayOffCreditCard) {
        //Output the number of months it will take for the user to pay off their credit card.
        System.out.printf("It will take %d months to pay off this card.\n", monthsToPayOffCreditCard);
    }

    public static void main(String[] args) {
        //Call userInput function
        //Call monthsToPayOffCreditCard function
        //Call outputStatement function
    }
}