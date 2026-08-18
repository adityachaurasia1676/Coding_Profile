import java.util.*;

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        HashMap<String, Integer> freq = new HashMap<>();
        HashMap<String, Integer> bann = new HashMap<>();

        for (String word : banned) {
            bann.put(word, 1);
        }

        String[] words = paragraph.toLowerCase().replaceAll("[^a-z]", " ").split("\\s+");

        for (String word : words) {
            if (!word.isEmpty() && !bann.containsKey(word)) {
                freq.put(word, freq.getOrDefault(word, 0) + 1);
            }
        }

        String result = "";
        int maxCount = 0;

        for (Map.Entry<String, Integer> entry : freq.entrySet()) {
            if (entry.getValue() > maxCount) {
                result = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        return result;
    }
}