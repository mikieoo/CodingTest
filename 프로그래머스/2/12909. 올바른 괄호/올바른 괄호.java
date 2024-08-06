import java.util.Stack;

class Solution {
    boolean solution(String s) {
        boolean answer = false;

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(s.charAt(i));
            } else if (c == ')'){
                if(!stack.isEmpty() && stack.peek() == '('){
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
        }

        if (stack.isEmpty()) return true;
        else return false;
        
    }
}