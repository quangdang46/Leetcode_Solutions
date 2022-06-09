class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] r = Arrays.copyOf(nums,  nums.length * 2);
        for (int i = 0; i < nums.length; i++) {
        	r [i + nums.length] = nums[i];
        }
        return r;
    }
}