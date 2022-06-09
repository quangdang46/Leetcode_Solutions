import java.util.*;

class Solution {
    public int heightChecker(int[] heights) {
        int[] expected = new int[heights.length];
        for (int i = 0; i < heights.length; i++) {
            expected[i] = heights[i];
        }
        Arrays.sort(expected);
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i]) {
                count++;
            }
        }
        return count;
    }

}

class Solution {
    public int heightChecker(int[] heights) {
        int result = 0;
        int[] sortedHeight = new int[heights.length];

        for (int i = 0; i < heights.length; i++) {
            sortedHeight[i] = heights[i];
        }

        quickSort(sortedHeight, 0, sortedHeight.length - 1);

        for (int i = 0; i < heights.length; i++) {
            if (sortedHeight[i] != heights[i]) {
                result++;
            }
        }

        return result;
    }

    private void quickSort(int[] arr, int left, int right) {
        if (left <= right) {
            int pivotIndex = partition(arr, left, right);
            quickSort(arr, left, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, right);
        }
    }

    private int partition(int[] arr, int left, int right) {

        int pivotValue = arr[right];
        int replaceIndex = left - 1;

        for (int i = left; i <= right; i++) {
            if (arr[i] < pivotValue) {
                replaceIndex++;
                int temp = arr[replaceIndex];
                arr[replaceIndex] = arr[i];
                arr[i] = temp;
            }
        }

        replaceIndex++;
        int temp = arr[replaceIndex];
        arr[replaceIndex] = arr[right];
        arr[right] = temp;

        return replaceIndex;
    }
}



class Solution {
    public int heightChecker(int[] heights) {
        if(heights == null){
            return 0;
        }
        int diffCount = 0;
        int[] countingSort = new int[100];
        for(int e : heights) {
            countingSort[e-1]++;
        }
        
        for(int i=0, c=0; i< heights.length && c<countingSort.length;) {
            if(countingSort[c] == 0) {
                c++;
                continue;
            }
            if(heights[i] != c+1) {
                diffCount++;
            }
            --countingSort[c];
            i++;
        }
        
        return diffCount;
    }
}