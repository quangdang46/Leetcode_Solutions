class Solution {
    public void Reverse(String[] strings) {
        for (int i = 0; i < strings.length / 2; i++) {
            String temp = strings[i];
            strings[i] = strings[strings.length - 1 - i];
            strings[strings.length - 1 - i] = temp;
        }
    }
    public String reverseWords(String s) {
        String[] str=s.split(" ");
        Reverse(str);
        StringBuilder sb=new StringBuilder();
        for(String tmp:str) {
            if(tmp.length()!=0){
                sb.append(tmp);
                sb.append(" ");
            }
        }
        return sb.toString().trim();
    }
}


// public String reverseWords(String s) {
//     char[] chars=s.toCharArray();
//     reverse(chars, 0, chars.length-1);
//     int startIndex=0;
//     for(int i=0; i<chars.length; i++){
//         if(chars[i]!=' '){
//             if(startIndex!=0){chars[startIndex++]=' ';}
//             int j=i;
//             while(j<chars.length && chars[j]!=' '){
//                 chars[startIndex++]=chars[j++];
//             }
//             reverse(chars, startIndex-(j-i), startIndex-1);
//             i=j;
//         }
//     }
//     return new String(chars, 0, startIndex);
// }

// private void reverse(char[] chars, int i, int j){
//     while(i<j){
//         char temp=chars[i];
//         chars[i++]=chars[j];
//         chars[j--]=temp;
//     }
// }
