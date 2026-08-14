class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>() ;
        for(String s : strs){
            char[] ch = s.toCharArray() ;
            Arrays.sort(ch) ;
            String str = new String(ch) ;
            map.computeIfAbsent(str, k -> new ArrayList<>()).add(s) ;

        }
        return new ArrayList<>(map.values()) ;
    }
}