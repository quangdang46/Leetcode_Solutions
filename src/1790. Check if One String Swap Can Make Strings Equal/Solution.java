class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        int[] cnt = new int[256];
        for (int i = 0; i < s1.length(); i++) {
            cnt[s1.charAt(i)-'a']++;
        }
        for (int i = 0; i < s2.length(); i++) {
            cnt[s2.charAt(i)-'a']--;
        }
        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] != 0) {
                return false;
            }
        }
        return true;    
    }
}