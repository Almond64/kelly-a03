/*
 * UCF COP3330 Fall 2021 Assignment 3 Solutions
 * Copyright 2021 paul kelly
 */

package baseline;

import java.util.Arrays;
import java.util.Scanner;

public class Solution24 {

    public static final Scanner input = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        Solution24 app = new Solution24();
        //Declare string1 and string2
        java.lang.String string1;
        java.lang.String string2;

        //Print the input prompt
        System.out.println("Enter two strings and I'll tell you if they are anagrams: ");
        //Prompt the user to enter the first string
        System.out.print("Enter the first string: ");
        string1 = app.getInputFromUser();
        //Prompt the user to enter the second string
        System.out.print("Enter the second string: ");
        string2 = app.getInputFromUser();
        //convert strings to char arrays
        char[] ch1 = app.stringToCharArray(string1);
        char[] ch2 = app.stringToCharArray(string2);

        // sort char arrays
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        //Determine if ch1 and ch2 are anagrams
        boolean anagram = app.isAnagram(ch1, ch2);

        //Print the result
        output(anagram, string1, string2);
    }

    java.lang.String getInputFromUser() {
        // read in String data (whitespace and all)
        // return new String
        return input.next();
    }

    public char[] stringToCharArray(java.lang.String str) {
        // create an array and store the array returned by toCharArray()
        return str.toCharArray();
    }

    public boolean isAnagram(char[] string1, char[] string2) {
        //Get lengths of both strings
        int n1 = string1.length;
        int n2 = string2.length;

        //If the lengths of both strings are not equal, then return false
        if (n1 != n2)
            return false;

        //Compare sorted strings;
        for (int i = 0; i < n1; i++)
            if (string1[i] != string2[i])
                return false;

        return true;
    }

    static void output(boolean isAnagram, java.lang.String string1, java.lang.String string2) {
        //remember to print quotation marks around the strings
        if (isAnagram) {
            //remember to print quotation marks around the strings
            System.out.printf("\"%s\" and \"%s\" are anagrams.\n", string1, string2);
        } else {
            //remember to print quotation marks around the strings
            System.out.printf("\"%s\" and \"%s\" are not anagrams.\n", string1, string2);
        }
    }

}
