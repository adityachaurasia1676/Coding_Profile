class Solution {
    public int firstRepeated(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>() ;
        for(int val : arr){
            map.put(val, map.getOrDefault(val,0)+1) ;
        }
        
        for(int i = 0 ;i<arr.length;i++){
            int temp = map.getOrDefault(arr[i],0) ;
            if(temp > 1){
                return i + 1 ;
            }
        }
        return -1 ;
    }
}
