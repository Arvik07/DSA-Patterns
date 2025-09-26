import java.util.*;

class RecentCounter {
    private Queue<Integer> requests;

    public RecentCounter() {
        requests = new LinkedList<>();
    }

    public int ping(int t) {
        // add the current ping
        requests.add(t);

        // remove pings older than t - 3000
        while (!requests.isEmpty() && requests.peek() < t - 3000) {
            requests.poll();
        }

        // size of queue = number of valid pings
        return requests.size();
    }
}
