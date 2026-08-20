class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        int happy = 0;
        Arrays.sort(s);
        int i= 0 ,j =0 ;
        while(i < g.length && j < s.length){
            if(s[j] >= g[i]){
                happy++;
                i++;
                j++;
            } else {
                j++;
            }
        }
        return happy ;
    }
}