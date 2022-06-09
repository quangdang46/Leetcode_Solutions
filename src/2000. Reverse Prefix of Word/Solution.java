class Solution {
    public String reversePrefix(String word, char ch) {
        int idx=word.indexOf(ch);
        if(idx==-1) return word;
        String prefix=word.substring(0,idx+1);
        //reverse prefix
        StringBuilder sb=new StringBuilder(prefix);
        sb.reverse();
        return sb.toString()+word.substring(idx+1);
    }
}