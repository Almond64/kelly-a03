/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Paul Kelly
 */

package baseline;

import java.util.Scanner;

public class Solution27 {

    public static final Scanner input = new Scanner(System.in);

    private static String getFirstName() {
        //Ask the user to enter their first name
        System.out.print("Enter the first name: ");
        //Scan first name
        return input.next();
    }

    private static String getLastName() {
        //Ask the user to enter their last name
        System.out.print("Enter the last name: ");
        //Scan last name
        return input.next();
    }

    private static String getZipCode() {
        //Ask the user to enter their zip code
        System.out.print("Enter the ZIP code: ");
        //Scan zip code
        return input.next();
    }

    private static String getEmployeeID() {
        //Ask the user to enter their employee ID
        System.out.print("Enter the employee ID: ");
        //Scan employee ID
        return input.next();
    }

    public static String validateFirstName(String getFirstName) {
        // Check if the first name is at least two characters long.
        // If not, create string = "The first name must at least be 2 characters long."
        // Check if the first name is filled in.
        // If not, create string = "The first name must be filled in."
        if (getFirstName.length() < 2) {
            if (getFirstName.equals(" "))
                return "The first name must be at least 2 characters long.\n" +
                       "The first name must be filled in.\n";
            else
                return "The first name must be at least 2 characters long.\n";
        } else
            return " ";
    }

    public static String validateLastName(String getLastName) {
        // Check if the last name is at least two characters long.
        // If not, create string = "The last name must at least be 2 characters long."
        // Check if the last name is filled in.
        // If not, create string = "The last name must be filled in."
        if (getLastName.length() < 2) {
            if (getLastName.equals(" "))
                return "The last name must be at least 2 characters long.\n" +
                       "The last name must be filled in.\n";
            else
                return "The last name must be at least 2 characters long.\n";
        } else
            return " ";
    }

    public static String validateEmployeeID(String getEmployeeID) {
        // Check if the employee ID is in the format of AA-1234.
        // If not, create string = "The employee ID must be in the form of AA-1234."
        if (getEmployeeID.matches("^\\S{2}-\\d{4}$"))
            return " ";
        else
            return "The employee ID must be in the format of AA-1234.\n";
    }

    public static String validateZipCode(String getZipCode) {
        // Check if the zip code is a 5 digit integer.
        // If not, create string = "The zipcode must be a 5 digit number."
        if (getZipCode.matches("\\d{5}"))
            return " ";
        else
            return "The zipcode must be a 5 digit number.\n";
    }

    public static void validateInput(String validateFirstName, String validateLastName, String validateEmployeeID, String validateZipCode)  {
        //Piece together all the outputs from the validation functions into a single output statement.
        System.out.print(validateFirstName + validateLastName
        + validateEmployeeID + validateZipCode + "\n");
    }

    public static void main(String[] args) {
        //Call all the getter functions
        String firstName = getFirstName();
        String lastName = getLastName();
        String zipCode = getZipCode();
        String employeeID = getEmployeeID();
        //Call all the validation functions
        String output1 = validateFirstName(firstName);
        String output2 = validateLastName(lastName);
        String output3 = validateEmployeeID(employeeID);
        String output4 = validateZipCode(zipCode);
        //Call validateInput
        validateInput(output1, output2, output3, output4);
    }
}
