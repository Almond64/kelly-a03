/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 first_name last_name
 */

package baseline;

import java.util.Scanner;

public class Solution25 {

    public static final Scanner in = new Scanner(System.in);

    public static void main (String[] args) {
        //declare String password
        //call the password validator function
        //print the output statement (single output statement)

    }

    public int passwordValidator(String password) {
        //If the password only contains numbers and is less than 8 characters in length (very weak), return 0
        //If the password only contains letters and is less than 8 characters long (weak), return 1
        //If the password contains letters, at least one number, and 8 or more characters (strong), return 2
        //If the password contains letters, numbers, special characters, and at least 8 characters (very strong), return 3
        //If none of the above comments describe the password (unknown strength), return 4
        return 0;
    }

}
