class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for(int i=0;i<jewels.length();i++){
            char je = jewels.charAt(i) ;
            for(int j=0;j<stones.length();j++){
                char st = stones.charAt(j) ;
                if(je == st){
                    count++ ;
                }
            }
        }
        return count ;
    }
}