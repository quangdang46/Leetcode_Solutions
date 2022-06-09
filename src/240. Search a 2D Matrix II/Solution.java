class Solution {
    public boolean BinarySearch(int[] row,int target){
        int l=0,r=row.length-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(row[mid]==target) return true;
            else if(row[mid]>target) r=mid-1;
            else l=mid+1;
        }
        return false;
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        for(int[] row : matrix){
            if(BinarySearch(row,target)){
                return true;
            }
        }
        return false;
        
    }
}


class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0) return false;
    
        int row = 0;
        int col = matrix[0].length - 1;
        
        while(row < matrix.length && col >= 0) {
            if (matrix[row][col] == target)
                return true;
            
            if(matrix[row][col] < target)
                row++;
            else
                col--;
        }
        
        return false;
    }
}