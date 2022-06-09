class Solution {
    public int minStartValue(int[] nums) {
        int min_prefix = 0, prefix = 0;
        for (int num : nums) {
            prefix += num;
            min_prefix = Math.min(min_prefix, prefix);
        }
        return 1 - min_prefix;
    }
}
