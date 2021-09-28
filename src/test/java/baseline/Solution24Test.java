package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution24Test {
    @Test
    public void test_string_to_char_array() {
        Solution24 app = new Solution24();
        java.lang.String str = "silent";

        char[] actual_result = app.stringToCharArray(str);
        char[] expected_result = new char[] { 's', 'i', 'l', 'e', 'n', 't'};

        assertEquals(expected_result, actual_result);
    }

    @Test
    public void test_is_anagram() {
        Solution24 app = new Solution24();
        char[] ch1 = new char[]{'s', 'i', 'l', 'e', 'n', 't'};
        char[] ch2 = new char[]{'l', 'i', 's', 't', 'e', 'n'};

        boolean actual_result = app.isAnagram(ch1, ch2);
        boolean expected_result = true;

        assertTrue(actual_result);
    }
}