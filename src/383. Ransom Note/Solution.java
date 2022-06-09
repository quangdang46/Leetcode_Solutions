class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        if(ransomNote.length() > magazine.length())
            return false;
        
        int[] count = new int[26];
        
        for(char a: ransomNote.toCharArray()){
            int i = magazine.indexOf(a, count[a - 'a']);
            
            if(i == -1){
                return false;
            }
            count[a - 'a'] = i+1;
        }
        return true;
    }
}