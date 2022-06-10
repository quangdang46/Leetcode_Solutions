class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        int[] count = new int[128];

        for (int l = 0, r = 0; r < s.length(); ++r) {
            ++count[s.charAt(r)];
            while (count[s.charAt(r)] > 1)
                --count[s.charAt(l++)];
            ans = Math.max(ans, r - l + 1);
        }

        return ans;
    }
}

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() < 2)
            return s.length();
        int max = 0;
        char[] split = s.toCharArray();
        int[] map = new int[256];
        for (int i = 0, j = 0; i < split.length; i++) {
            char c = split[i];
            j = Math.max(j, map[c]);
            map[c] = i + 1;
            max = Math.max(max, i - j + 1);
        }
        return max;
    }
}
