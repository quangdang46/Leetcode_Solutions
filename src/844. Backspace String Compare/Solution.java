import java.util.*;
class Solution {
    public boolean backspaceCompare(String S, String T) {
        return backspace(S).equals(backspace(T));
    }

    private String backspace(String s) {
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray())
            if (c != '#')
                sb.append(c);
            else if (sb.length() != 0)
                sb.deleteCharAt(sb.length() - 1);

        return sb.toString();
    }
    public static void main(String[] args) {
        String s="ab #c";
        System.out.println(Arrays.toString(s.toCharArray()));
    }
}
