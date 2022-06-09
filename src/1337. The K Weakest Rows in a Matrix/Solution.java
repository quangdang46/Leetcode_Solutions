class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] ans = new int[k];
        int[][] candidates = new int[mat.length][2];

        for (int i = 0; i < mat.length; ++i) {
            candidates[i][0] = IntStream.of(mat[i]).sum();
            candidates[i][1] = i;
        }

        Arrays.sort(candidates, (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);

        for (int i = 0; i < k; ++i)
            ans[i] = candidates[i][1];

        return ans;
    }
}

class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] temp = new int[mat.length];
        int i = 0;
        
        for(int[] arr: mat)
            temp[i++] = countOf0(arr);
        
        int[] ans = new int[k];
        for(int j = 0; j < k; ++j)
            ans[j] = minIndex(temp);
        
        return ans;
    }
    
    int minIndex(int[] arr)
    {
        int minindex = 0;
        int min = Integer.MAX_VALUE;
        
        for(int i = 0; i < arr.length; ++i)
        {
            if(arr[i] < min)
            {
                min = arr[i];
                minindex = i;
            }
        }
        
        arr[minindex] = Integer.MAX_VALUE;
        return minindex;
    }
    
    int countOf0(int[] arr)
    {
        int count = 0;
        for(int i: arr)
        {
            if(i == 1)
                ++count;
            else
                break;
        }
        
        return count;
    }
}
    