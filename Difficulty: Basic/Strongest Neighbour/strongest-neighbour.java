class Solution {
    public ArrayList<Integer> maxAdj(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>() ;
        for(int i = 0 ;i<arr.length -1 ;i++){
            if(arr[i] > arr[i+1]){
                list.add(arr[i]) ;
            }else{
                list.add(arr[i+1]) ;
            }
        }
        return list ;
    }
};