class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
       Map<Integer,Integer> map = new HashMap<>() ;

       for(int i : nums){
        int freq = map.getOrDefault(i , 0) ;
        count += freq ;
        map.put(i, freq + 1) ;
       }
       return count ;
    }
}