import java.util.*;

class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            q1.add(i);
        }

        int count = k;
        while (q1.size() + q2.size() > 1) {
            while (!q1.isEmpty() && (q1.size() + q2.size() > 1)) {
                count--;
                if (count == 0) {
                    q1.remove();    
                    count = k;   
                } else {
                    q2.add(q1.remove()); 
                }
            }

            while (!q2.isEmpty() && (q1.size() + q2.size() > 1)) {
                count--;
                if (count == 0) {
                    q2.remove();
                    count = k;
                } else {
                    q1.add(q2.remove());
                }
            }
        }
        return q1.isEmpty() ? q2.peek() : q1.peek();
    }
}
