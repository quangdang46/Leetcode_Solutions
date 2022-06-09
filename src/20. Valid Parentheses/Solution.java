class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (top != map.get(c)) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}



class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(Character c : s.toCharArray()) {
            if(c=='{' || c=='(' || c=='['){
                stack.push(c);
            }else{
                if(stack.isEmpty()) {
                    return false;
                }else{
                    char top = stack.peek();
                    if(top=='{' && c=='}' || top=='(' && c==')' || top=='[' && c==']'){
                        stack.pop();
                    }else{
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}
