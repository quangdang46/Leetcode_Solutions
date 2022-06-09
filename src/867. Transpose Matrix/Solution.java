class Solution {

    public int[][] transpose(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int[][] result = new int[m][n];
        int k=0;
        for(int[] nums:matrix) {
            for(int num:nums) {
                result[k%m][k/m] = num;
                k++;
            }
        }
        return result;

    }
}