class Solution {
    public int maxProduct(String[] words) {
        int ans = 0;
        int[] masks = new int[words.length]; // "abd" -> (1011)2

        for (int i = 0; i < words.length; ++i)
            masks[i] = getMask(words[i]);

        for (int i = 0; i < masks.length; ++i)
            for (int j = 0; j < i; ++j)
                if ((masks[i] & masks[j]) == 0)
                    ans = Math.max(ans, words[i].length() * words[j].length());

        return ans;
    }

    private int getMask(final String word) {
        int mask = 0;
        for (final char c : word.toCharArray())
            mask |= 1 << c - 'a';
        return mask;
    }
}



class Solution {
    public int maxProduct(String[] words) {
        int res = 0;
        
        for(int i = 0; i < words.length-1; i++){
            for(int j = i+1; j < words.length; j++){
                if(words[i].length() * words[j].length() > res){
                    if(!commonLettersExist(words[i], words[j])){
                        res = words[i].length() * words[j].length();
                    }
                }
            }
        }
        
        return res;
    }
    
    public boolean commonLettersExist(String s1, String s2){
        for(int i = 0; i < s1.length(); i++){
            if(s2.contains(s1.charAt(i) + "")){
                return true;
            }
        }
        return false;
    }
}