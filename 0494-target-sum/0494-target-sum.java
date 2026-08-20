class Solution {
    int tot = 0;

    public int findTargetSumWays(int[] nums, int target) {
        tot = 0;
        f(nums, target, 0, 0);
        return tot;
    }

    private void f(int[] nums, int target, int idx, int curr) {
        if (idx == nums.length) {
            if (curr == target) {
                tot++;
            }
            return;
        }

        f(nums, target, idx + 1, curr + nums[idx]);
        f(nums, target, idx + 1, curr - nums[idx]);
    }
}