class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total = 0, fuel = 0, start = 0;
        for (int i = 0; i < gas.length; i++) {
            int diff = gas[i] - cost[i];
            total = total + gas[i]-cost[i];
            fuel = fuel + gas[i] - cost[i];
            if (fuel < 0) {
                start = i + 1;
                fuel = 0;
            }
        }
        return total < 0 ? -1 : start;
    }
}
