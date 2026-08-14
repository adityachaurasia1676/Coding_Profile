class Solution {
    public int countKDifference(int[] nums, int k) {
        int count = 0 ;
        HashMap<Integer,Integer> map = new HashMap<>() ;
        for(int x : nums){
            count += map.getOrDefault(x - k, 0) ;
            count += map.getOrDefault(x + k, 0) ;
            map.put(x, map.getOrDefault(x, 0) + 1) ;
        }
        return count ;
    }
}