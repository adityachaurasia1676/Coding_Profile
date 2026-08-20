import java.util.*;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;

        // step 1: create boolean array
        boolean[] seen = new boolean[n + 1];

        // step 2: mark numbers present in nums
        for (int x : nums) {
            seen[x] = true;
        }

        // step 3: check which numbers are missing
        List<Integer> result = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (!seen[i]) {
                result.add(i);
            }
        }

        return result;
    }
}