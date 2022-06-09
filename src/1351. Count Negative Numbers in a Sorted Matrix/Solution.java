class Solution {
    public int countNegatives(int[][] grid) {
        int cnt=0;
        int n=grid.length-1;
        for(int[] row : grid) {
            int i=0;
            while(i<row.length && row[i]>=0) {
                i++;
            }
            if(i<row.length) {
                cnt+=row.length-i;
            }
        }
        return cnt;
    }
}