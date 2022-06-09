class Solution {
    public boolean isMatch(String str, String pattern) {
        int s = 0, p = 0, match = 0, starIdx = -1;
        while (s < str.length()) {
            if (p < pattern.length() && (pattern.charAt(p) == '?' || str.charAt(s) == pattern.charAt(p))) {
                s++;
                p++;
            } else if (p < pattern.length() && pattern.charAt(p) == '*') {
                starIdx = p;
                match = s;
                p++;
            } else if (starIdx != -1) {
                p = starIdx + 1;
                match++;
                s = match;
            }

            else
                return false;
        }

        while (p < pattern.length() && pattern.charAt(p) == '*')
            p++;

        return p == pattern.length();
    }
}

class Solution {
    public boolean isMatch(String s, String p) {
        final int m = s.length();
        final int n = p.length();
        boolean[][] dp = new boolean[m + 1][n + 1];
        dp[0][0] = true;

        for (int j = 0; j < p.length(); ++j)
            if (p.charAt(j) == '*')
                dp[0][j + 1] = dp[0][j];

        for (int i = 0; i < m; ++i)
            for (int j = 0; j < n; ++j)
                if (p.charAt(j) == '*') {
                    final boolean matchEmpty = dp[i + 1][j];
                    final boolean matchSome = dp[i][j + 1];
                    dp[i + 1][j + 1] = matchEmpty || matchSome;
                } else if (isMatch(s, i, p, j)) {
                    dp[i + 1][j + 1] = dp[i][j];
                }

        return dp[m][n];
    }

    private boolean isMatch(final String s, int i, final String p, int j) {
        return j >= 0 && p.charAt(j) == '?' || s.charAt(i) == p.charAt(j);
    }
}
