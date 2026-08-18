class Solution {
    public int[] twoSum(int[] numbers, int target) {
           
        for(int i=0;i<numbers.length;i++){
            int l = i + 1 ;
            int h = numbers.length - 1 ;
            int tar = target - numbers[i] ;
            while(l <= h){
                int mid = l + (h - l) / 2  ;
                
                if(tar == numbers[mid]){
                    return new int[]{i + 1,mid + 1} ;
                }else if(numbers[mid] > tar){
                    h = mid - 1;
                }else {
                    l = mid + 1 ;
                }
            }
        }
        return new int[]{-1,-1} ;
    }
}