import java.util.Stack;

class Solution {
    public String decodeString(String str) {
        Stack<String> stack = new Stack<>();
        int n = str.length();
        
        for (int i = 0; i < n; i++) {
            char c = str.charAt(i);
            
            if (Character.isDigit(c)) {
                // build full number (could be more than one digit)
                StringBuilder num = new StringBuilder();
                while (i < n && Character.isDigit(str.charAt(i))) {
                    num.append(str.charAt(i));
                    i++;
                }
                i--; // step back because for loop will increment
                stack.push(num.toString());
            } else if (c == ']') {
                // pop until '['
                StringBuilder sb = new StringBuilder();
                while (!stack.isEmpty() && !stack.peek().equals("[")) {
                    sb.insert(0, stack.pop());
                }
                stack.pop(); // remove "["

                // get number before [
                int repeat = Integer.parseInt(stack.pop());
                StringBuilder expanded = new StringBuilder();
                for (int j = 0; j < repeat; j++) {
                    expanded.append(sb);
                }
                stack.push(expanded.toString());
            } else {
                stack.push(String.valueOf(c));
            }
        }
        
        // final result
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.insert(0, stack.pop());
        }
        return result.toString();
    }
}
