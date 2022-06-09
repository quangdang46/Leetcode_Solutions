class Solution {
    public String sortSentence(String s) {
        StringBuilder sb = new StringBuilder();
        String[] str=new String[s.length()+1];
        for(String s1:s.split(" ")){
            // int idx=s1.charAt(s1.length()-1)-'0';
            str[s1.charAt(s1.length()-1)-'0'] = s1.substring(0, s1.length()-1);
        }
        for(String s2:str){
            if(s2!=null){
                sb.append(s2);
                sb.append(" ");
            }
        }
        return sb.toString().trim();
    }

}