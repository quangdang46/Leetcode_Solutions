class Solution {
    public boolean check(int[][] matrix,int i,int j) {
        int result=matrix[i][j];
        for(int k=0;k<matrix[0].length;k++){
            if(k!=j && result>matrix[i][k])
                return false;
        }
        for(int k=0;k<matrix.length;k++){
            if(k!=i && result<matrix[k][j])
                return false;
        }
        return true;
    }


    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> result=new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(check(matrix,i,j)){
                    result.add(matrix[i][j]);
                }
            }
        }
        return result;
        
    }
}










class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            int pos = findMinRow(matrix[i]);
            int val = matrix[i][pos];
            boolean check = findMaxCol(matrix, pos, val);
            if(check){
                ans.add(val);
            }
        }
        return ans;
    }
    public static int findMinRow(int[] arr){
        int idx=0;
        for(int i=1;i<arr.length;i++){
            if(arr[idx]>arr[i])
                idx=i;
        }
        return idx;
    }
    public static boolean findMaxCol(int[][] matrix, int col, int val){
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][col]>val)
                return false;
        }
        return true;
    }
}



class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        List<Integer> output = new ArrayList<>();
        
        for (int i = 0; i < row; i++) {
            int curr = matrix[i][0];
            int colPos = 0;
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] < curr) {
                    curr = matrix[i][j];
                    colPos = j;
                }
            }
            
            boolean isMax = true;
            for (int k = 0; k < row; k++) {
                if (matrix[k][colPos] > curr) {
                    isMax = false;
                }
            }
            
            if (isMax) {
                output.add(curr);
            }
        }
        
        return output;
    }
}