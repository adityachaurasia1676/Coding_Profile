class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        Stack<Integer> st = new Stack() ;
        int max = -1  ;
        for(int i = arr.length - 1;i >= 0;i--){
            if(arr[i] >= max){
                st.push(arr[i]) ;
                max = arr[i] ;
            }
        }
        ArrayList<Integer> list = new ArrayList<>() ;
        
        while(!st.isEmpty()){
            list.add(st.pop()) ;    
        }
        return list ;
    }
}
