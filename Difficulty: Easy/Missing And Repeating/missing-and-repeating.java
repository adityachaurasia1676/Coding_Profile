import java.util.*;

class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        int rep = -1;
        int miss = -1;
        Set<Integer> set = new HashSet<>();

        // Find repeating element
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                rep = arr[i];
            } else {
                set.add(arr[i]);
            }
        }

        // Find missing element
        for (int i = 1; i <= arr.length; i++) {
            if (!set.contains(i)) {
                miss = i;
                break;
            }
        }

        return new ArrayList<>(Arrays.asList(rep, miss));
    }
}