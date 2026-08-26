class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set = new HashSet<>() ;
        for(int val : nums){
            set.add(val) ;
        }
        int mul = k ;
        while(set.contains(mul)){
            mul += k ;
        }
        return mul ;
    }
}