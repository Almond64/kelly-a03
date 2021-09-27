/*
 * UCF COP3330 Fall 2021 Assignment 3 Solutions
 * Copyright 2021 paul kelly
 */

package baseline;

import java.util.Arrays;
import java.util.Scanner;

public class Solution24 {

    public static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Solution24 app = new Solution24();
        //Declare string1 and string2
        java.lang.String string1;
        java.lang.String string2;

        //Prompt the user to enter the first string
        string1 = app.getInputFromUser1();
        //Prompt the user to enter the second string
        string2 = app.getInputFromUser2();
        //convert strings to char arrays
        char[] ch1 = string1ToCharArray(string1);
        char[] ch2 = string2ToCharArray(string2);

        // sort char arrays
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        //Determine if ch1 and ch22 are anagrams
        boolean anagram = app.isAnagram(ch1, ch2);

        //Print the result
        //remember to print quotation marks around the strings
        if (anagram == true) {
            //remember to print quotation marks around the strings
            System.out.printf("%s and %s are anagrams.\n");
        } else {
            //remember to print quotation marks around the strings
            System.out.printf("%s and %s are not anagrams.\n");
        }
    }

    public java.lang.String getInputFromUser1() {
        //print input prompt
        System.out.print("Enter two strings and I'll tell you if they are anagrams:\nEnter the first string: ");
        // read in String data (whitespace and all)
        java.lang.String str1 = input.next();
        // return new String
        return str1;
    }

    public java.lang.String getInputFromUser2() {
        //print input prompt
        System.out.print("Enter two strings and I'll tell you if they are anagrams:\nEnter the first string: ");
        // read in String data (whitespace and all)
        java.lang.String str2 = input.next();
        // return new String
        return str2;
    }

    public static char[] string1ToCharArray(java.lang.String string1) {
        //Create char array of string1 length
        char[] ch1 = new char[string1.length()];
        //Copy string1 into its char array
        System.arraycopy(string1, 0, ch1, 0, string1.length());
        //Return string1
        return ch1;
    }

    public static char[] string2ToCharArray(java.lang.String string2) {
        //Create char array of string1 length
        char[] ch2 = new char[string2.length()];
        //Copy string1 into its char array
        System.arraycopy(string2, 0, ch2, 0, string2.length());
        //Return string1
        return ch2;
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

}
