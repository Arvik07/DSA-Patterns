import java.util.*;

class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for (String op : operations) {
            if (op.equals("+")) {
                int last = stack.pop();
                int secondLast = stack.peek();
                stack.push(last); // put it back
                stack.push(last + secondLast);
            } 
            else if (op.equals("D")) {
                stack.push(2 * stack.peek());
            } 
            else if (op.equals("C")) {
                stack.pop();
            } 
            else {
                stack.push(Integer.parseInt(op));
            }
        }

        int ans = 0;
        for (int score : stack) {
            ans += score;
        }
        return ans;
    }
}
