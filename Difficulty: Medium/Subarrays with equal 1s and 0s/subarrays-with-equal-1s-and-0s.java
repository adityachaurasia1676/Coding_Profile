class Solution {
    public int countSubarray(int[] arr) {
        // code here
        int n = arr.length ;
        int count = 0 ;
        int sum = 0 ;
        HashMap<Integer,Integer> map = new HashMap<>() ;
        map.put(0,1) ;
        for(int num : arr){
            sum += (num == 1) ? 1 : -1 ;
            if(map.containsKey(sum)){
                count += map.get(sum) ;
                
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1) ;
        }
        return count ;
    }
}