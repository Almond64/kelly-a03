package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution26Test {
    @Test
    void mpoccTest() {
        Solution26 app = new Solution26();
        int testBalance = 5000;
        int testAPR = 12;
        int testMonthlyPayment = 100;

        int actual_result = app.monthsToPayOffCreditCard(testBalance, testAPR, testMonthlyPayment);
        int expected_result = 70;

        assertEquals(expected_result, actual_result);
    }
}