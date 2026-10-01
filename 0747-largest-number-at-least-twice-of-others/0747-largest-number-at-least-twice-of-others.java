class Solution {
    public int dominantIndex(int[] nums) {
        int first = -1 ;
        int second = -1 ;
        int idx = 0 ;
        for(int i=0;i<nums.length;i++){
            if(nums[i] > first){
                second = first ;
                first = nums[i] ;
                idx = i ; 
            }else if(nums[i] > second){
                second = nums[i] ;
            }
        }
        if(first >= second * 2){
            return idx ;
        }
        return -1 ;
    }
}