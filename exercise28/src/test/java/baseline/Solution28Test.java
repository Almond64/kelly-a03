package baseline;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Solution28Test {
    @Test
    void test() {
        Solution28 app = new Solution28();

        int arr[] = {1, 2, 3, 4, 5};

        int total = 0;
        int i;

        for (i = 0; i < 5; i++) {
            total += arr[i];
        }

        int actual_result = app.addNumbers();
        int expected_result = total;
    }
}