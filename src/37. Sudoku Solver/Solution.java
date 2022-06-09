class Solution {
    boolean[][] rows = new boolean[9][9];
    boolean[][] columns = new boolean[9][9];
    boolean[][] boxes = new boolean[9][9];

    public void solveSudoku(char[][] board) {
        // scan sudoku for existing numbers
        for (int row = 0; row < 9; row++) {
            for (int column = 0; column < 9; column++) {
                char c = board[row][column];
                if (c == '.') {
                    continue;
                }
                rows[row][c - '1'] = true;
                columns[column][c - '1'] = true;
                boxes[row - row % 3 + column / 3][c - '1'] = true;
            }
        }

        boolean modified;
        do {
            modified = false;
            for (int row = 0; row < 9; row++) {
                for (int column = 0; column < 9; column++) {
                    char c = board[row][column];
                    if (c != '.') {
                        continue;
                    }
                    boolean[] rowSet = rows[row];
                    boolean[] columnSet = columns[column];
                    boolean[] boxSet = boxes[row - row % 3 + column / 3];
                    int optionCount = 0;
                    int option = -1;
                    for (int k = 0; k < 9; k++) {
                        if (rowSet[k] || columnSet[k] || boxSet[k]) {
                            continue;
                        }
                        optionCount++;
                        if (optionCount == 2) {
                            break;
                        }
                        option = k;
                    }
                    if (optionCount == 1) {
                        modified = true;
                        board[row][column] = (char) ('1' + option);
                        rowSet[option] = columnSet[option] = boxSet[option] = true;
                    }
                }
            }
        } while (modified);

        solveRecursive(board, 0, -1);
    }

    boolean solveRecursive(char[][] board, int row, int column) {
        if (row == 8 && column == 8) {
            return true;
        }
        if (column == 8) {
            column = 0;
            row++;
        } else {
            column++;
        }
        char c = board[row][column];
        if (c != '.') {
            return solveRecursive(board, row, column);
        }
        boolean[] rowSet = rows[row];
        boolean[] columnSet = columns[column];
        boolean[] boxSet = boxes[row - row % 3 + column / 3];
        for (int k = 0; k < 9; k++) {
            if (rowSet[k] || columnSet[k] || boxSet[k]) {
                continue;
            }
            board[row][column] = (char) ('1' + k);
            rowSet[k] = columnSet[k] = boxSet[k] = true;
            if (solveRecursive(board, row, column)) {
                return true;
            } else {
                rowSet[k] = columnSet[k] = boxSet[k] = false;
                board[row][column] = '.';
            }
        }
        return false;
    }
}




class Solution {
    public void solveSudoku(char[][] board) {
        dfs(board, 0);
    }

    private boolean dfs(char[][] board, int s) {
        if (s == 81)
            return true;
        int i = s / 9;
        int j = s % 9;

        if (board[i][j] != '.')
            return dfs(board, s + 1);

        for (char c = '1'; c <= '9'; ++c)
            if (isValid(board, i, j, c)) {
                board[i][j] = c;
                if (dfs(board, s + 1))
                    return true;
                board[i][j] = '.';
            }

        return false;
    }

    private boolean isValid(char[][] board, int row, int col, char c) {
        for (int i = 0; i < 9; ++i)
            if (board[i][col] == c || board[row][i] == c || board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == c)
                return false;
        return true;
    }
}