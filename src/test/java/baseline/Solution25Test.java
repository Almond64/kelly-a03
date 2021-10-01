package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution25Test {
    @Test
    void passwordValidator1() {
        Solution25 app = new Solution25();
        String password1 = "12345";

        int actual_result = app.passwordValidator(password1);
        int expected_result = 0;

        assertEquals(expected_result, actual_result);
    }

    @Test
    void passwordValidator2() {
        Solution25 app = new Solution25();
        String password2 = "abcdefg";

        int actual_result = app.passwordValidator(password2);
        int expected_result = 1;

        assertEquals(expected_result, actual_result);
    }

    @Test
    void passwordValidator3() {
        Solution25 app = new Solution25();
        String password3 = "password3";

        int actual_result = app.passwordValidator(password3);
        int expected_result = 2;

        assertEquals(expected_result, actual_result);
    }

    @Test
    void passwordValidator4() {
        Solution25 app = new Solution25();
        String password4 = "p@$$word4";

        int actual_result = app.passwordValidator(password4);
        int expected_result = 3;

        assertEquals(expected_result, actual_result);
    }

    @Test
    void passwordValidator5() {
        Solution25 app = new Solution25();
        String password5 = "password";

        int actual_result = app.passwordValidator(password5);
        int expected_result = 4;

        assertEquals(expected_result, actual_result);
    }
}