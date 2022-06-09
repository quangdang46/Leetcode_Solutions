class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String ans="";
        String prefix = strs[0];
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < strs.length; i++) {
            if(strs[i].length()<min) {
                min = strs[i].length();
            }
        }
        for(int i = 0; i <min; i++) {
            for(int j = 0; j < strs.length; j++) {
                if(strs[j].charAt(i) != prefix.charAt(i)) {
                    return ans;
                }
            }
            ans += prefix.charAt(i);
        }
        return ans;

    }

}