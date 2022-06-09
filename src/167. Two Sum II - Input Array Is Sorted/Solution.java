class Solution {

    public int binarySearch(int[] numbers, int l, int r, int num) {
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (numbers[mid] == num) {
                return mid;
            } else if (numbers[mid] > num) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }

    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        for (int i = 0; i < n - 1; i++) {
            int num1 = numbers[i];
            int num2 = target - num1;
            int idx = binarySearch(numbers, i + 1, n - 1, num2);
            if (idx != -1) {
                return new int[] { i + 1, idx + 1 };
            }
        }
        return new int[] { -1, -1 };
    }

}

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;

        while (left < right) {
            if (numbers[left] + numbers[right] == target) {
                return new int[] { left + 1, right + 1 };
            }

            if (numbers[left] + numbers[right] < target) {
                left += 1;
            } else {
                right -= 1;
            }
        }

        return new int[] { -1, -1 };
    }
}