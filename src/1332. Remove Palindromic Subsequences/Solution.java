class Solution {
    public int removePalindromeSub(String s) {
        if (s.length() == 0) {
            return 0;
        }
        if (s.equals(new StringBuilder(s).reverse().toString())) {
            return 1;
        }
        return 2;
    }
}