package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution27Test {
    @Test
    void testFirstName1() {
        Solution27 app = new Solution27();
        String firstName1 = "J";
        String actual_result = app.validateFirstName(firstName1);
        String expected_result = "The string must be at least 2 characters long.\n";
        assertEquals(expected_result, actual_result);
    }

    @Test
    void testFirstName2() {
        Solution27 app = new Solution27();
        String firstName2 = "John";
        String actual_result = app.validateFirstName(firstName2);
        String expected_result = " ";
        assertEquals(expected_result, actual_result);
    }

    @Test
    void testLastName1() {
        Solution27 app = new Solution27();
        String lastName1 = " ";
        String actual_result = app.validateLastName(lastName1);
        String expected_result = "The last name must be at least 2 characters long.\n" +
                                 "The last name must be filled in.\n";
        assertEquals(expected_result, actual_result);
    }

    @Test
    void testLastName2() {
        Solution27 app = new Solution27();
        String lastName2 = "Johnson";
        String actual_result = app.validateLastName(lastName2);
        String expected_result = " ";
        assertEquals(expected_result, actual_result);
    }

    @Test
    void testZipCode1() {
        Solution27 app = new Solution27();
        int zipCode1 = Integer.parseInt("ABCDE");
        String actual_result = app.validateZipCode(zipCode1);
        String expected_result = "The zipcode must be a 5 digit number.\n";
        assertEquals(expected_result, actual_result);
    }

    @Test
    void testZipCode2() {
        Solution27 app = new Solution27();
        int zipCode2 = Integer.parseInt("55555");
        String actual_result = app.validateZipCode(zipCode2);
        String expected_result = " ";
        assertEquals(expected_result, actual_result);
    }

    @Test
    void testEmployeeID1() {
        Solution27 app = new Solution27();
        String employeeID1 = "A12-1234";
        String actual_result = app.validateEmployeeID(employeeID1);
        String expected_result = "The employeeID must be in the format of AA-1234.\n";
        assertEquals(expected_result, actual_result);
    }

    @Test
    void testEmployeeID2() {
        Solution27 app = new Solution27();
        String employeeID2 = "TK-4321";
        String actual_result = app.validateEmployeeID(employeeID2);
        String expected_result = " ";
        assertEquals(expected_result, actual_result);
    }
}