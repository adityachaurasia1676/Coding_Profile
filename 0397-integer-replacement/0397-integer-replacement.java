class Solution {
    public int integerReplacement(int n) {
        long num = n ;
        int c = 0 ;
        while(num != 1 && num > 0){
            if(num  % 2 == 0 ){
            num /= 2 ;
            c++ ;
        } else{
           if( num == 3 || num % 4 == 1){
            num-- ;
           }else {
            num++ ;
           }
           c++ ;
        }
        }
        return c ;
    }
}