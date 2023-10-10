// url: https://leetcode.com/problems/factorial-trailing-zeroes/
class Solution {
    public int trailingZeroes(int n) {
        int count = 0;
        int currPowerOfFive = 5;
        while (n >= currPowerOfFive) {
            count += (n / currPowerOfFive);
            currPowerOfFive *= 5;
        }
        return count;
    }
}

// TC: O(log5 n), SC: O(1)

// 125! = 125/5 + 125/25 + 125/125 + 125/625