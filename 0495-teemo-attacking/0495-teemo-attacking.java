class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int sum = 0;
        if(timeSeries.length == 0) return 0 ;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i =0;i<timeSeries.length - 1;i++){
           sum += Math.min(duration,timeSeries[i + 1] - timeSeries[i]);
        }
        sum += duration ;
       return sum ;
    }
}