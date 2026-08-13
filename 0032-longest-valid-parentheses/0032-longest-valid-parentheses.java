class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        int arr[] = new int[s.length()]; 
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                st.push(i) ; 
            } else {
                if (!st.isEmpty()) {
                    int idx = st.pop();
                    arr[idx] = 1 ; 
                    arr[i] = 1 ;       
                }
            }
        }
        
        int max = 0;
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                c++;
                max = Math.max(max, c);
            } else {
                c = 0; 
            }
        }
        
        return max;
    }
}