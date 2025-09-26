import java.util.*;

class RecentCounter {

    // declare at class level, not inside constructor
    private List<Integer> requests;
    private int[] range;

    public RecentCounter() {
        requests = new ArrayList<>();
        range = new int[2];
    }

    public int ping(int t) {
        requests.add(t);
        range[0] = t - 3000;
        range[1] = t;

        int count = 0;
        for (int i = 0; i < requests.size(); i++) {
            if (requests.get(i) >= range[0] && requests.get(i) <= range[1]) {
                count++;
            }
        }
        return count;
    }
}
