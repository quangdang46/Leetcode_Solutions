class Solution {
    public int countOdds(int low, int high) {
        low=low%2==0?low+1:low;
        high=high%2==0?high-1:high;
        return (high - low)/ 2+1;
    }
}