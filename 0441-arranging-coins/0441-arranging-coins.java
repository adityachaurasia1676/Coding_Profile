class Solution {
    public int arrangeCoins(int n) {
        
        for (long i = 1; i <= n; i++) {
            long coinsNeeded = (i * (i + 1)) / 2;
            
            if (coinsNeeded == n) {
                return (int) i; 
            }
            if (coinsNeeded > n) {
                return (int) (i - 1); 
            }
        }
        return 0;
    }
}