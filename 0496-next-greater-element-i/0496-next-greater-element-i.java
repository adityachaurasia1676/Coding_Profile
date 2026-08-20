class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        int i = 0;
        next(st, i, nums1, nums2);
        return nums1;
    }
    
    public void convert(Stack<Integer> st, int[] nums1) {
        for (int i = nums1.length - 1; i >= 0; i--) {
            nums1[i] = st.pop();
        }
    }

    public void next(Stack<Integer> st, int i, int[] nums1, int[] nums2) {
        if (i == nums1.length) {
            convert(st, nums1);
            return;
        }
        
        int temp = nums1[i];
        int startX = 0;
        while (startX < nums2.length && nums2[startX] != temp) {
            startX++;
        }
        
        boolean found = false;
        for (int x = startX + 1; x < nums2.length; x++) {
            if (temp < nums2[x]) {
                st.push(nums2[x]);
                found = true;
                next(st, i + 1, nums1, nums2);
                break;
            }
        }
        
        if (!found) {
            st.push(-1);
            next(st, i + 1, nums1, nums2);
        }
    }
}