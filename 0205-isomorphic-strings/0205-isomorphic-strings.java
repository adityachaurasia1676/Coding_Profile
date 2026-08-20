class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] arr_s = new int[300] ;
        int[] arr_t = new int[300] ;
        for(int i=0;i<s.length();i++){
            char ch_s = s.charAt(i) ;
            char ch_t = t.charAt(i) ;
            // making a check if the arr is equal or not 
            if(arr_s[ch_s] != arr_t[ch_t]){
                return false ;
            }
            arr_s[ch_s] = i + 1 ;
            arr_t[ch_t] = i + 1 ;
        }
        return true ;
    }
}