class Solution {
    public int findKthPositive(int[] arr, int k) {
        int l = 0;
        int r = arr.length;
        while (l < r) {
            final int m = (l + r) / 2;
            if (arr[m] - m - 1 >= k)
                r = m;
            else
                l = m + 1;
        }

        return l + k;
    }
}
