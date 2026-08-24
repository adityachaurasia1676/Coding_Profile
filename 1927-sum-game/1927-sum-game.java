class Solution {
    public boolean sumGame(String num) {
        int lq = 0 , rq = 0 ;
        int leftsum = 0 , rightsum = 0 ;
        int n = num.length() ;
        for(int i=0;i<n/2;i++){
            if(num.charAt(i) == '?') lq++ ;
            else leftsum += num.charAt(i) - '0' ;
        }
        for(int i=n/2 ;i<n;i++){
            if(num.charAt(i) == '?') rq++ ;
            else rightsum += num.charAt(i) - '0' ;
        }
        if((lq + rq) % 2 != 0){
            return true ;
        }
        return (leftsum - rightsum) * 2 != (rq - lq) * 9 ;
    }
}