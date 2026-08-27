import java.util.*;

class Solution {
    public String minWindow(String s, String t) {
        if (s == null || t == null || s.length() < t.length()) {
            return "";
        }

        Map<Character, Integer> map = new HashMap<>();
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int req = map.size();
        int found = 0;

        Map<Character, Integer> check = new HashMap<>();
        int l = 0, r = 0;
        int len = Integer.MAX_VALUE;
        int st = 0;

        while (r < s.length()) {
            char ch1 = s.charAt(r);
            check.put(ch1, check.getOrDefault(ch1, 0) + 1);

            if (map.containsKey(ch1) && check.get(ch1).intValue() == map.get(ch1).intValue()) {
                found++;
            }

            while (l <= r && found == req) {
                char ch2 = s.charAt(l);
                
                if (r - l + 1 < len) {
                    len = r - l + 1;
                    st = l;
                }

                check.put(ch2, check.get(ch2) - 1);

                if (map.containsKey(ch2) && check.get(ch2).intValue() < map.get(ch2).intValue()) {
                    found--;
                }

                l++;
            }
            r++;
        }

        return len == Integer.MAX_VALUE ? "" : s.substring(st, st + len);
    }
}