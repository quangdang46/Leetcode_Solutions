class Solution {

    private boolean checkRowAndCol(char[][] a, int k, boolean isRow) {
        boolean[] daXuatHien = new boolean[a.length + 1];

        for (int j = 0; j < a.length; j++) {
            char c = isRow ? a[k][j] : a[j][k];
            if (c != '.') {
                int c_int = (int) c - (int) ('0');
                if (daXuatHien[c_int] == true)
                    return false;
                daXuatHien[c_int] = true;
            }
        }

        return true;
    }

    // Check block 3x3 from (i,j)
    private boolean checkBlock(char[][] a, int i0, int j0) {
        boolean[] daXuatHien = new boolean[a.length + 1];
        int i_end = i0 + 3;
        int j_end = j0 + 3;

        for (int i = i0; i < i_end; i++) {
            for (int j = j0; j < j_end; j++) {
                char c = a[i][j];
                if (c != '.') {

                    if (daXuatHien[c-'0'] == true)
                        return false;
                    daXuatHien[c-'0'] = true;
                }
            }
        }

        return true;
    }

    public boolean isValidSudoku(char[][] a) {
        // Kiem tra cac hang ngang
        // Kiem tra cac hang doc
        for (int i = 0; i < a.length; i++) {
            if (!checkRowAndCol(a, i, true) || !checkRowAndCol(a, i, false))
                return false;
        }

        // Kiem tra cac block 3x3
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                if (checkBlock(a, i, j) == false)
                    return false;
            }
        }

        return true;
    }

}

class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] != '.' && !isValid(i, j, board.length, board)) {
                    return false;
                }

            }

        }
        return true;
    }

    public static boolean isValid(int i, int j, int n, char board[][]) {
        for (int k = 0; k < n; k++) {
            if (k != i && board[k][j] == board[i][j]) {

                return false;
            }

        }
        for (int k = 0; k < n; k++) {
            if (k != j && board[i][k] == board[i][j]) {

                return false;
            }

        }
        int k = i / 3 * 3;
        int z = j / 3 * 3;
        for (int l = 0; l < 3; l++) {
            for (int m = 0; m < 3; m++) {
                // System.out.println(k+ " "+ z+ " "+k+l+" "z+m);
                if (k + l != i && z + m != j && board[k + l][z + m] == board[i][j])
                    return false;
            }
        }
        return true;
    }
}