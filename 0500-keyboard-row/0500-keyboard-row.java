class Solution {
    public String[] findWords(String[] words) {

        ArrayList<Character> row1 = new ArrayList<>();
        ArrayList<Character> row2 = new ArrayList<>();
        ArrayList<Character> row3 = new ArrayList<>();

        for (char c : "qwertyuiop".toCharArray()) row1.add(c);
        for (char c : "asdfghjkl".toCharArray()) row2.add(c);
        for (char c : "zxcvbnm".toCharArray()) row3.add(c);

        ArrayList<String> result = new ArrayList<>();

        for (String word : words) {
            String w = word.toLowerCase();

            ArrayList<Character> currentRow;

            char ch = w.charAt(0);
            if (row1.contains(ch)) {
                currentRow = row1;
            } else if (row2.contains(ch)) {
                currentRow = row2;
            } else {
                currentRow = row3;
            }

            boolean valid = true;

            for (char c : w.toCharArray()) {
                if (!currentRow.contains(c)) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                result.add(word);
            }
        }

        return result.toArray(new String[0]);
    }
}