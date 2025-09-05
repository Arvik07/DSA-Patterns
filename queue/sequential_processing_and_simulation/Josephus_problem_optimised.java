class Solution {
    public int findTheWinner(int n, int k) {
        int winner = 1; // with 1 person, winner is position 1
        for (int i = 2; i <= n; i++) {
            winner = (winner + k - 1) % i + 1;
        }
        return winner;
    }
}
