/*
 * UCF COP3330 Fall 2021 Assignment 3 Solutions
 * Copyright 2021 paul kelly
 */

package baseline;

public class Solution24 {
    public static void main(String[] args) {
        Solution24 app = new Solution24();
        //Declare string1 and string2
        String string1, string2;

        //Prompt the user to enter the first string
        string1 = app.getInputFromUser();
        //Prompt the user to enter the second string
        string2 = app.getInputFromUser();
        //Determine if string1 and string2 are anagrams
        boolean anagram = app.isAnagram(string1, string2);

        //Print the result
    }

    private String getInputFromUser() {
        //print input prompt
        // read in String data
        // return new String
        return null;
    }

    private boolean isAnagram(String string1, String string2) {
        //Get lengths of both strings
        //If the lengths of both strings are not equal, then return false
        //Sort both strings
        //Compare sorted strings;

        return true;
    }
}
