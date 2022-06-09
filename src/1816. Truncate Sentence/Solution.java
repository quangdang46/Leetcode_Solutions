class Solution {
    public String truncateSentence(String s, int k) {
        if (s.length() <= k) {
            return s;
        }
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k; i++) {
            sb.append(words[i]).append(" ");
        }
        return sb.toString().trim();
        
    }
}

class Solution {
    public String truncateSentence(String s, int k) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (count == k) {
                return s.substring(0, i - 1);
            }
            if (s.charAt(i) == ' ') {
                count++;
            }
        }
        return s;
    }
}



        