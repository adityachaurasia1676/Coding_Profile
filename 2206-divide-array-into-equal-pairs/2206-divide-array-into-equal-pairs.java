class Solution {
    public boolean divideArray(int[] nums) {
        int[] freq = new int[501] ;
        for(int i : nums){
            freq[i]++ ;
        }
        for(int j = 0 ;j < freq.length ;j++ ){
            if(freq[j] % 2 != 0){
                return false ;
            }
        }
        return true ;
    }
}