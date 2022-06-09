class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int numberOfDigit = (int)Math.floor(Math.log10(nums[i])) + 1;
            if(numberOfDigit % 2 == 0){
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {12,345,2,6,7896};
        System.out.println(s.findNumbers(nums));
    }
}