// url: https://leetcode.com/problems/single-number/
/* Naive Solution code */
class Solution {
    public int singleNumber(int[] nums) {
        if (nums.length == 1) return nums[0]; 
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                set.remove(nums[i]);
            } else {
                set.add(nums[i]);
            }
        }
        return set.iterator().next(); 
    }
} 
// TC: O(n), SC: O(n)

/* Optimal Solution Code*/
class Solution {
    public int singleNumber(int[] nums) {
        int singleNum = 0;
        for (int num : nums) {
            singleNum = singleNum ^ num;
        }
        return singleNum;
    }
} 
// TC: O(n), SC: O(1)