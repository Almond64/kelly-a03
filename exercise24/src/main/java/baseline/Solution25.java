/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 first_name last_name
 */

package baseline;

public class Solution25 {

    public static int passwordValidator(String password) {
        //If the password only contains numbers and is less than 8 characters in length (very weak), return 0
        if (password.matches("[0-9]+") && password.length() < 8)
            return 0;
        //If the password only contains letters and is less than 8 characters long (weak), return 1
        if (password.matches("^[a-zA-Z]*$") && password.length() < 8)
            return 1;
        //If the password contains letters, at least one number, and 8 or more characters (strong), return 2
        if (password.matches("^(?=.*[a-zA-Z])(?=.*[0-9])[a-zA-Z0-9]+$")
                && password.length() >= 8)
            return 2;
        //If the password contains letters, numbers, special characters, and at least 8 characters (very strong), return 3
        if (password.matches("^(?=.*[a-zA-Z])(?=.*\\d)"
                + "(?=.*[-+_!@#$%^&*., ?]).+$")
                && password.length() >= 8)
            return 3;
        //If none of the above comments describe the password (unknown strength), return 4
        else
            return 4;
    }

    private static void outputStatement(int passwordValidator, String password) {
        if (passwordValidator == 0)
            System.out.printf("'%s' is a very weak password.\n", password);
        else if (passwordValidator == 1)
            System.out.printf("'%s' is a weak password.\n", password);
        else if (passwordValidator == 2)
            System.out.printf("'%s' is a strong password.\n", password);
        else if (passwordValidator == 3)
            System.out.printf("'%s' is a very strong password.\n", password);
        else
            System.out.printf("'%s' is of unknown strength.\n", password);
    }

    public static void main (String[] args) {
        //declare String password
        String password1 = "12345";
        String password2 = "abcdef";
        String password3 = "abc123xyz";
        String password4 = "1337h@xor!";

        //call the password validator function
        //print the output statement (single output statement)
        outputStatement(passwordValidator(password1), password1);
        outputStatement(passwordValidator(password2),password2);
        outputStatement(passwordValidator(password3), password3);
        outputStatement(passwordValidator(password4), password4);
    }

}
