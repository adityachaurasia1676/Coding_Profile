class Solution {
    public int search(int arr[], int x) {
        boolean check = true ;
        Map<Integer,Integer> map = new HashMap<>() ;
        for(int i = 0;i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],i) ;
            }
        }
        return map.getOrDefault(x,-1) ;
    }
}
