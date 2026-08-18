class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>() ;
        for(int num : nums1){
            set1.add(num) ;
        }
        Set<Integer> insert = new HashSet<>() ;
        for(int num : nums2){
            if(set1.contains(num)){
                insert.add(num) ;
            }
        }
        int[] result = new int[insert.size()] ;
        int idx = 0 ;
        for(int num : insert){
            result[idx++] = num ;
        } 
        return result ;
    }
}