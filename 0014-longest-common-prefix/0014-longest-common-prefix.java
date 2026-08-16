class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder s = new StringBuilder() ;
        Arrays.sort(strs) ;
        int n = strs.length ;
        for(int i = 0;i<strs[0].length();i++){
            if(strs[0].charAt(i) == strs[ n - 1].charAt(i)){
                s.append( strs[0].charAt(i) );
            } else{
                break ;
            }
        }
        return s.toString() ;
    }
}