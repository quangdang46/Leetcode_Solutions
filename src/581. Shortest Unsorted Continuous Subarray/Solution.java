class Solution {
    public int findUnsortedSubarray(int[] nums) {
        final int n = nums.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        boolean meetDecrease = false;
        boolean meetIncrease = false;

        for (int i = 1; i < n; ++i) {
            if (nums[i] < nums[i - 1])
                meetDecrease = true;
            if (meetDecrease)
                min = Math.min(min, nums[i]);
        }

        for (int i = n - 2; i >= 0; --i) {
            if (nums[i] > nums[i + 1])
                meetIncrease = true;
            if (meetIncrease)
                max = Math.max(max, nums[i]);
        }

        int l = 0;
        for (l = 0; l < n; ++l)
            if (nums[l] > min)
                break;

        int r = 0;
        for (r = n - 1; r >= 0; --r)
            if (nums[r] < max)
                break;

        return l > r ? 0 : r - l + 1;
    }
}

class Solution {

    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length;
        int left = 0, right = n - 1;
        int i = 0, j = n - 1, max = -99999999, min = 99999999;
        boolean flag = true;
        for (; i < n; ++i) {
            if (nums[i] >= max) {
                max = nums[i];
                if (flag)
                    left = i;
            } else {
                flag = false;
                while (left >= 0 && nums[left] > nums[i])
                    --left;
            }
        }
        flag = true;
        for (; j >= 0; --j) {
            if (nums[j] <= min) {
                min = nums[j];
                if (flag)
                    right = j;
            } else {
                flag = false;
                while (right < n && nums[right] < nums[j])
                    ++right;
            }
        }
        return right > left ? right - left - 1 : 0;
    }
}