// url: https://leetcode.com/problems/reverse-integer/
class Solution {
    public int reverse(int x) {
        int min = Integer.MIN_VALUE; // - 2,147,483,648
        int max = Integer.MAX_VALUE; //   2,147,483,647
        if (x == min || x == max) return 0;
        int reversed = 0;
        while (x != 0) {
            int lastDigit = x % 10; // getting the last digit
            if (reversed > max/10) return 0; // positive integer
            if (reversed < min/10) return 0; // negative integer
            reversed = reversed * 10 + lastDigit;
            x = x / 10; // removing the last digit
        }
        return reversed;
    }
}
// TC: O(log10 x), SC: O(1)