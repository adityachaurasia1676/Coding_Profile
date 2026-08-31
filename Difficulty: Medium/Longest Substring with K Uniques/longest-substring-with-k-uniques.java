class Solution {
    public int longestKSubstr(String s, int k) {
        // code here
        Map<Character,Integer> map = new HashMap<>() ;
        int max = -1 ;
        int l = 0 ;
        for(int r = 0 ;r < s.length();r++){
            char right = s.charAt(r) ;
            map.put(right,map.getOrDefault(right,0) + 1) ;
            
            while(map.size() > k){
                char left = s.charAt(l) ;
                map.put(left, map.get(left)-1) ;
                if(map.get(left) == 0){
                    map.remove(left) ;
                }
                l++ ;
            }
            if(map.size() == k){
                max = Math.max(max, r - l + 1) ;
            }
        }
        return max ;
    }
}