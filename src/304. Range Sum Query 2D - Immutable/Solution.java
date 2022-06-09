class NumMatrix {
    int[][] matrix;
    public NumMatrix(int[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] sum = new int[m+1][n+1];
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                sum[i][j] = sum[i-1][j] + sum[i][j-1] - sum[i-1][j-1] + matrix[i-1][j-1];
            }
        }
        this.matrix = sum;
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        return matrix[row2+1][col2+1] - matrix[row2+1][col1] - matrix[row1][col2+1] + matrix[row1][col1];
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */