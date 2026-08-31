class Solution {
    public int minimumDeletions(int[] nums) {
       int max_pos = 0 ;
       int min_pos = 0 ;
       int n = nums.length ;
       for(int i =0;i<nums.length;i++){
            if(nums[i] > nums[max_pos]){
                max_pos = i ;
            }
            if(nums[i] < nums[min_pos]){
                min_pos = i ;
            }
       }
       int left = Math.min(min_pos, max_pos);
        int right = Math.max(min_pos, max_pos);

        int option1 = right + 1;
        
        int option2 = n - left;
        
        int option3 = (left + 1) + (n - right);

        return Math.min(option1, Math.min(option2, option3));
    }
}