class Solution {
    public int[] singleNumber(int[] nums) {
       ArrayList<Integer> list = new ArrayList<>() ;
       for(int i=0;i<nums.length;i++){
        int c = 0 ;
        for(int j=0;j<nums.length;j++){
            if(nums[i] == nums[j]){
                c++ ;
            }
        }
        if(c == 1){
            list.add(nums[i]) ;
        }
       } 
       int[] ans = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}