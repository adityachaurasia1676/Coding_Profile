class Solution {
    public void rearrange(int arr[]) {
        // code here
        Arrays.sort(arr) ;
        int n = arr.length ;
        int[] ans = new int[n] ;
        int left = 0 , right = n - 1 ;
        for(int i = 0 ;i < n ;i++){
            if(i % 2 == 0){
                ans[i] = arr[right--] ;
            }else{
                ans[i] = arr[left++] ;
            }
        }
        System.arraycopy(ans,0,arr,0,n) ;
    }
}
