class Solution {
    boolean twoSum(int arr[], int target) {
       if(arr.length < 2) return false ;
       Arrays.sort(arr) ;
       int l = 0 ;
       int h = arr.length - 1 ;
       while(l < h){
           int sum = arr[l] + arr[h] ;
           if(sum == target){
               return true ;
           }else if(sum < target){
               l++ ;
           }else{
               h-- ;
           }
       }
       return false ;
    }
}