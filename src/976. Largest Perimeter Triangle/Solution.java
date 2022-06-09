class Solution {
    public int largestPerimeter(int[] A) {
        Arrays.sort(A);
        for (int i = A.length - 1; i > 1; --i)
        if (A[i - 2] + A[i - 1] > A[i])
            return A[i - 2] + A[i - 1] + A[i];
        return 0;
    }
}

class Solution {
    public int largestPerimeter(int[] A) {
        moveMax(A, A.length - 1);
        moveMax(A, A.length - 2);
        moveMax(A, A.length - 3);
        for(int i = A.length-1; i > 1; i--) {
            if(A[i - 2] + A[i - 1] > A[i]){
                return A[i - 2] + A[i - 1] + A[i];
            } else if(i > 2) {                
                moveMax(A, i - 3);
            }
        }
        
        return 0;
    }    
    public void moveMax(int[] A, int maxIndex){
        int max = Integer.MIN_VALUE;
        int index = -1;
        
        for (int i=0; i <= maxIndex; i++){
            if(A[i] > max){
                index = i;
                max = A[i];
            }
        }
        
        int tmp = A[maxIndex];
        A[maxIndex] = max;        
        A[index] = tmp;        
    }

}


  