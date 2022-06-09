class Solution {
    public int lengthOfLastWord(String s) {
        return s.split(" ")[s.split(" ").length - 1].length();
    }
}