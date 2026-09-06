class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        ArrayList<Integer> list = new ArrayList<>();

        int n = matrix.length;
        int m = matrix[0].length;

        int minR = 0, minC = 0;
        int maxR = n - 1, maxC = m - 1;

        int ct = 0;
        int total = n * m;

        while (ct < total) {

            for (int i = minC; i <= maxC && ct < total; i++) {
                list.add(matrix[minR][i]);
                ct++;
            }
            minR++;

            for (int i = minR; i <= maxR && ct < total; i++) {
                list.add(matrix[i][maxC]);
                ct++;
            }
            maxC--;

            for (int i = maxC; i >= minC && ct < total; i--) {
                list.add(matrix[maxR][i]);
                ct++;
            }
            maxR--;

       
            for (int i = maxR; i >= minR && ct < total; i--) {
                list.add(matrix[i][minC]);
                ct++;
            }
            minC++;
        }

        return list;
    }
}