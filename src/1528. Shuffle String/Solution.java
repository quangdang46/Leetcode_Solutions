import java.util.*;
class Solution {
    public String restoreString(String s, int[] indices) {
        HashMap<Integer, Character> map = new HashMap<Integer,Character>();
        for(int i = 0; i < indices.length; i++){
            map.put(indices[i], s.charAt(i));
        }
        Arrays.sort(indices);
        String result="";
        for(int num:indices){
            result +=map.get(num);
        }
        return result;
    }
}

class Solution {
    public String restoreString(String s, int[] indices) {
        int n=s.length();
        char[] c=new char[n];
        for(int i=0;i<n;i++){
            c[indices[i]]=s.charAt(i);
        }
        return String.valueOf(c);
    }
}