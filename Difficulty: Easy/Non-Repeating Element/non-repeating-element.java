class Solution {
    public int firstNonRepeating(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>() ;
        for(int val : arr){
            map.put(val , map.getOrDefault(val, 0) + 1) ;
        }
        int ans = 0 ;
        for(int val : arr){
            if(map.get(val) == 1 ){
                return val ;
            }
        } 
        return 0 ;
    }
}
