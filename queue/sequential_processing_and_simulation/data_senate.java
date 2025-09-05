import java.util.*;

class Solution {
    public String predictPartyVictory(String senate) {
        int n = senate.length();
        Queue<Integer> radiant = new LinkedList<>();
        Queue<Integer> dire = new LinkedList<>();

        // Step 1: Put indices of R and D into separate queues
        for (int i = 0; i < n; i++) {
            if (senate.charAt(i) == 'R') {
                radiant.add(i);
            } else {
                dire.add(i);
            }
        }

        // Step 2: Process rounds until one queue is empty
        while (!radiant.isEmpty() && !dire.isEmpty()) {
            int rIndex = radiant.poll();
            int dIndex = dire.poll();

            // The senator with smaller index acts first and bans the other
            if (rIndex < dIndex) {
                // Radiant bans Dire, Radiant goes to next round
                radiant.add(rIndex + n); // circular rotation
            } else {
                // Dire bans Radiant, Dire goes to next round
                dire.add(dIndex + n); // circular rotation
            }
        }

        // Step 3: Check which party remains
        return radiant.isEmpty() ? "Dire" : "Radiant";
    }
}
