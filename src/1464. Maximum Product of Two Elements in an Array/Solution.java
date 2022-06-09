class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length - 1] * nums[nums.length - 2];
    }
}

class Solution {
    public int maxProduct(int[] nums) {
        int max1 = 0;
        int max2 = 0;
        for (int n: nums) {
            if (n>= max1) {
                max2 = max1;
                max1 = n;
            } else if(n>max2) {
                max2 = n;
            }
        }
        return (max1-1) * (max2-1);
    }
}