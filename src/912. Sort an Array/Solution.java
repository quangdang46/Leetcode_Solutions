class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    private void mergeSort(int[] A, int l, int r) {
        if (l >= r)
            return;
        final int m = (l + r) / 2;
        mergeSort(A, l, m);
        mergeSort(A, m + 1, r);
        merge(A, l, m, r);
    }

    private void merge(int[] A, int l, int m, int r) {
        int[] sorted = new int[r - l + 1];
        int k = 0; // sorted's index
        int i = l; // left's index
        int j = m + 1; // right's index

        while (i <= m && j <= r)
            if (A[i] < A[j])
                sorted[k++] = A[i++];
            else
                sorted[k++] = A[j++];

        while (i <= m)
            sorted[k++] = A[i++];

        while (j <= r)
            sorted[k++] = A[j++];
        System.arraycopy(sorted, 0, A, l, sorted.length);
    }
}

class Solution {
    public int[] sortArray(int[] nums) {
        // 1 Create an array count, each indice representing
        // a different number in the given min max num range
        int k = nums.length, max = nums[0], min = nums[0];
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        max++;
        max -= min;
        int[] count = new int[max];
        // 2 Count how many instances a given number appears
        // in the array
        for (int i = 0; i < max; i++)
            count[i] = 0;
        for (int i = 0; i < k; i++)
            count[nums[i] - min]++;
        // 3 Sum all the indices with its next
        for (int i = 0; i < max - 1; i++)
            count[i + 1] += count[i];
        // 4 Assign values from original array to a new array
        // according to count as a map
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[count[nums[i] - min] - 1] = nums[i];
            count[nums[i] - min]--;
        }
        return res;
    }
}