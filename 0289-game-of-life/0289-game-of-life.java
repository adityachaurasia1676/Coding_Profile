class Solution {
    public void gameOfLife(int[][] board) {
        int n = board.length;
        int m = board[0].length;
        int[][] ans = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int count = 0;

                for (int x = -1; x <= 1; x++) {
                    for (int y = -1; y <= 1; y++) {
                        if (x == 0 && y == 0) continue;

                        int r = i + x;
                        int c = j + y;

                        if (r >= 0 && r < n && c >= 0 && c < m) {
                            if (board[r][c] == 1) {
                                count++;
                            }
                        }
                    }
                }

                if (board[i][j] == 1) {
                    if (count == 2 || count == 3) {
                        ans[i][j] = 1;
                    }
                } else {
                    if (count == 3) {
                        ans[i][j] = 1;
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                board[i][j] = ans[i][j];
            }
        }
    }
}