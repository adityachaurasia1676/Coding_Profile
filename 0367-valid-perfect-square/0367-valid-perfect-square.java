class Solution {
    public boolean isPerfectSquare(int x) {
        long l = 1 ;
        long h = x ;
        long ans = 0 ;
        while(l <= h){
            long mid = l + (h-l) / 2 ;
            if((mid * mid) <= x){
                l = mid + 1 ;
                ans = mid ;
            } else h = mid - 1 ; 
        }
        if((x == ans * ans ) )return true ;
        return false ;
    }
}