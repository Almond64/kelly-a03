/*
 * UCF COP3330 Fall 2021 Assignment 3 Solutions
 * Copyright 2021 paul kelly
 */

package baseline;

import java.util.Scanner;
import java.util.Random;

public class Solution32 {

    public static final Scanner input = new Scanner(System.in);

    private static int difficultyLevel() {
        //prompt the user to enter difficulty level (1, 2, or 3)
        System.out.print("Enter the difficulty level (1, 2, or 3): ");
        //Scan user input
        return input.nextInt();
    }

    private static void guessingGame(int difficultyLevel) {
        Random rand = new Random();
        int guess_number;
        int user_guess;
        int guessCount = 0;
        //If the difficulty level is 1, have the user guess a number between 1 and 10.
        //If the difficulty level is 2, have the user guess a number between 1 and 100.
        //If the difficulty level is 3, have the user guess a number between 1 and 1000.
        //Have the computer pick a random number depending on the difficulty level.
        //Prompt the user to guess the random number.
        //If the user guesses incorrectly, prompt the user to guess again
        //If the user guesses correctly, display the number of guesses it took.
        if (difficultyLevel == 1) {
            //generate random number between 1 and 10
            guess_number = rand.nextInt(10) + 1;
            //prompt user for guess
            System.out.print("I have my number. What's your guess? ");
            //Scan user guess
            user_guess = input.nextInt();
            //while user guesses incorrectly, prompt them to guess again
            while (user_guess != guess_number) {
                if (user_guess < guess_number) {
                    System.out.print("Too low. Guess again: ");
                    user_guess = input.nextInt();
                    guessCount++;
                }
                if (user_guess > guess_number) {
                    System.out.print("Too high. Guess again: ");
                    user_guess = input.nextInt();
                    guessCount++;
                } else {
                    System.out.printf("You got it in %d guesses!\n", guessCount);
                    break;
                }
            }
        } else if (difficultyLevel == 2) {
            //generate random number between 1 and 100
            guess_number = rand.nextInt(100) + 1;
            //prompt user for guess
            System.out.print("I have my number. What's your guess? ");
            //Scan user guess
            user_guess = input.nextInt();
            //while user guesses incorrectly, prompt them to guess again
            while (user_guess != guess_number) {
                if (user_guess < guess_number) {
                    System.out.print("Too low. Guess again: ");
                    user_guess = input.nextInt();
                    guessCount++;
                }
                if (user_guess > guess_number) {
                    System.out.print("Too high. Guess again: ");
                    user_guess = input.nextInt();
                    guessCount++;
                } else {
                    System.out.printf("You got it in %d guesses!\n", guessCount);
                    break;
                }
            }
        } else {
            //generate random number between 1 and 1000
            guess_number = rand.nextInt(1000) + 1;
            //prompt user for guess
            System.out.print("I have my number. What's your guess? ");
            //Scan user guess
            user_guess = input.nextInt();
            //while user guesses incorrectly, prompt them to guess again
            while (user_guess != guess_number) {
                if (user_guess < guess_number) {
                    System.out.print("Too low. Guess again: ");
                    user_guess = input.nextInt();
                    guessCount++;
                }
                if (user_guess > guess_number) {
                    System.out.print("Too high. Guess again: ");
                    user_guess = input.nextInt();
                    guessCount++;
                } else {
                    System.out.printf("You got it in %d guesses!\n", guessCount);
                    break;
                }
            }
        }
    }

    private static void playAgain() {
        int level;
        //prompt the user if they wish to play again
        System.out.print("Do you wish to play again (Y/N)? ");
        String answer = input.next();
        //if the user says yes, call difficulty level
        //else, quit
        if (answer.equals("y")) {
            level = difficultyLevel();
            guessingGame(level);
        }
    }

    public static void main(String[] args) {
        System.out.println("Let's play Guess the Number!\n");
        //call difficulty level function
        int level = difficultyLevel();
        //call guessing game function
        guessingGame(level);
        //call play again function
        playAgain();
    }

}
