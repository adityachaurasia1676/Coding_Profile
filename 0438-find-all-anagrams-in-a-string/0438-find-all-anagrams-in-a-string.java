class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>() ;
        if(s.length() < p.length()) return list ;
        Map<Character, Integer> pmap = new HashMap<>() ;
        Map<Character, Integer> windowMap = new HashMap<>() ;

        for(char c : p.toCharArray()){
            pmap.put(c, pmap.getOrDefault(c, 0) + 1) ;
        }

        int left = 0 , right = 0 ;
        int m = p.length() ;
        while( right < s.length()){
            char chr = s.charAt(right) ;
            windowMap.put(chr,windowMap.getOrDefault(chr,0) + 1) ;
            if(right - left + 1 == m){
                if(windowMap.equals(pmap)){
                    list.add(left) ;
                }
                char chl = s.charAt(left) ;
                windowMap.put(chl, windowMap.get(chl) - 1) ;
                if(windowMap.get(chl) == 0){
                    windowMap.remove(chl) ;
                }
                left++ ;
            }
            right++ ;
        }
        return list ;
    }
}