class Solution {
    public int thirdMax(int[] nums) {
        int[] arr = Arrays.stream(nums)
                            .distinct()
                            .sorted()
                            .toArray();
        int n = arr.length;
        if(n >= 3){
            return arr[n-3];
        } else{
            return arr[n-1];
        }
    }
}