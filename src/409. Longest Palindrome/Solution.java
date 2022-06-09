class Solution {
    public int longestPalindrome(String s) {
        int[] count = new int[128];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;
        }
        int ans = 0;
        for (int i = 0; i < count.length; i++) {
            ans += count[i] / 2 * 2;
            if (ans % 2 == 0 && count[i] % 2 == 1) {
                ans++;
            }
        }
        return ans;
    }
}