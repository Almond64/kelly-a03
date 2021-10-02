package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution26Test {
    @Test
    void mpoccTest() {
        int testBalance = 5000;
        double testAPR = 12;
        int testMonthlyPayment = 100;

        int actual_result = Solution26.monthsToPayOffCreditCard(testBalance, testAPR, testMonthlyPayment);
        int expected_result = 70;
        assertEquals(expected_result, actual_result);
    }
}