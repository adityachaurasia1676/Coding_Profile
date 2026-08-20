
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        Deque<Integer> d = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            if (!d.isEmpty() && d.peekFirst() < i - k + 1) {
                d.pollFirst();
            }

            while (!d.isEmpty() && nums[d.peekLast()] < nums[i]) {
                d.pollLast();
            }

            d.addLast(i);

            if (i >= k - 1) {
                ans[i - k + 1] = nums[d.peekFirst()];
            }
        }

        return ans;
    }
}