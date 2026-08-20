class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int product = 1;  
        int c = 0;
        for (int i = 0; i < n; i++) {
            if(nums[i] != 0){
                product *= nums[i] ;
            }
            if(nums[i] == 0){
                c++ ;
            }
        }
        for(int j=0;j<n;j++){
            if(c == 0){
                result[j] = product / nums[j] ;
            } else if(c == 1){
                if(nums[j] == 0 ){
                    result[j] = product ;
                } else{
                    result[j] = 0 ;
                }
            } else{
                result[j] = 0 ;
            }
        }

        return result;
    }
} 