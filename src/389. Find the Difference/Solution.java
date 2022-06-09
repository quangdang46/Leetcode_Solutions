class Solution {
    public char findTheDifference(String s, String t) {
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            count[c - 'a']--;
            if (count[c - 'a'] < 0) {
                return c;
            }
        }
        return ' ';

    }
}

/*

class Solution {
    public char findTheDifference(String ss, String tt) {
        
        
        char[] s = ss.toCharArray();
        char[] t = tt.toCharArray();
        
        //int[] charCount = new int[('z'-'a')+1];
        
        char sum = t[t.length-1];
        
        for (int i=0; i<s.length; i++){
            sum += t[i];
            sum -= s[i];
        }
                
        return sum;
    }
}
*/ 