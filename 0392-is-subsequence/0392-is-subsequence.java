class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0,j=0 ;
        if(s.length() == 0) return true ;
        while(i < s.length() && j < t.length()){
            char sc = s.charAt(i) ;
            char tc = t.charAt(j) ;
            if(sc == tc){
                i++ ;
                j++ ;
            }else if(sc != tc){
                j++ ;
            }
        }
        return i == s.length() ;
    }
}