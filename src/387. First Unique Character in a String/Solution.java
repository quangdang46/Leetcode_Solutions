// class Solution {
//     public int firstUniqChar(String s) {
//         int[] cnt= new int[26];
//         for(int i=0;i<s.length();i++){
//             cnt[s.charAt(i)-'a']++;
//         }
//         for(int i=0;i<s.length();i++){
//             if(cnt[s.charAt(i)-'a']==1) return i;
//         }
//         return -1;
//     }
// }

class Solution {
    public int firstUniqChar(String s) {
        
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        char[] chars = s.replaceAll(" ", "").toCharArray();
        
        
        for(int i=0; i<chars.length; i++) {
            map.put(chars[i], map.getOrDefault(chars[i], 0) + 1);
        }
        
        for(int i=0; i<chars.length; i++) {
            if(map.get(chars[i])==1) {
                return i;
            }
        }
        
        return -1;
    }
}