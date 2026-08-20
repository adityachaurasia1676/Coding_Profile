import java.util.Arrays;

class Solution {
    public int rob(int[] nums) {
        int[] memo = new int[nums.length];
        Arrays.fill(memo, -1);
        return sum(nums, 0, memo);
    }
    private int sum(int[] nums, int i, int[] memo) {
        if (i >= nums.length) {
            return 0;
        }
        
        if (memo[i] != -1) {
            return memo[i];
        }
        
        int curr = nums[i] + sum(nums, i + 2, memo);
        int skip = sum(nums, i + 1, memo);
        
        memo[i] = Math.max(curr, skip);
        return memo[i];
    }
}