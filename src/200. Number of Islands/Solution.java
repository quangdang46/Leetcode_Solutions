class Solution {
    boolean[][] daDuyet = new boolean[300][300];

    public void dfs(char[][] a, int i, int j) {
        int m = a.length, n = a[0].length;
        if (i < 0 || j < 0 || i >= m || j >= n)
            return;

        if (a[i][j] == '0' || daDuyet[i][j] == true)
            return;
        daDuyet[i][j] = true;
        dfs(a, i, j + 1);
        dfs(a, i, j - 1);
        dfs(a, i - 1, j);
        dfs(a, i + 1, j);
    }

    public int numIslands(char[][] grid) {
        int cnt = 0;
        int m = grid.length;
        int n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1' && daDuyet[i][j] == false) {
                    dfs(grid, i, j);
                    cnt++;
                }
            }
        }
        return cnt;
    }
}

class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int res = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    res++;
                    helper(grid, i, j);
                }
            }
        }
        return res;
    }

    public void helper(char[][] grid, int i, int j) {
        if (i < 0 || i == grid.length || j < 0 || j == grid[i].length || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';
        helper(grid, i + 1, j);
        helper(grid, i - 1, j);
        helper(grid, i, j + 1);
        helper(grid, i, j - 1);
    }
}