class Solution {
    public void sortInWave(int arr[]) {
        int i = 0 ;
        while(i < arr.length - 1){
            if(i % 2 == 0){
                int temp = arr[i] ;
                arr[i] = arr[i+1] ;
                arr[i+1] = temp ;
            }
            i += 2 ;
        }
        
    }
}
