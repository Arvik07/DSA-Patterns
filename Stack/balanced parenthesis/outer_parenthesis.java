import java.util.*;

class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                // if stack not empty,this '(' is not outermost
                if (!stack.isEmpty()) {
                    result.append(c);
                }
                stack.push(c);
            } else { 
                stack.pop();
                // if stack not empty after popping, this ')' is not outermost
                if (!stack.isEmpty()) {
                    result.append(c);
                }
            }
        }

        return result.toString();
    }
}
