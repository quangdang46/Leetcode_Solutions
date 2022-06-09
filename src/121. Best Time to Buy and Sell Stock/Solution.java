class Solution {
    public int maxProfit(int[] prices) {
        int sum = 0;
        int cursum = Integer.MIN_VALUE;
        for(int tmp:prices) {
            sum = Math.max(sum, cursum+tmp);
            cursum = Math.max(cursum, -tmp);
        }
        return sum;
        
    }
}