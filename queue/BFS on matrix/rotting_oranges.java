import java.util.*;

class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        int fresh = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 2) {
                    q.add(new int[]{i, j});
                }
                if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }

        if (fresh == 0) return 0;

        int minutes = -1;

        while (!q.isEmpty()) {
            int size = q.size();
            minutes++;

            for (int k = 0; k < size; k++) {
                int[] cur = q.poll();
                int i = cur[0], j = cur[1];

                // up
                if (i > 0 && grid[i - 1][j] == 1) {
                    grid[i - 1][j] = 2;
                    fresh--;
                    q.add(new int[]{i - 1, j});
                }

                // down
                if (i < n - 1 && grid[i + 1][j] == 1) {
                    grid[i + 1][j] = 2;
                    fresh--;
                    q.add(new int[]{i + 1, j});
                }

                // left
                if (j > 0 && grid[i][j - 1] == 1) {
                    grid[i][j - 1] = 2;
                    fresh--;
                    q.add(new int[]{i, j - 1});
                }

                // right
                if (j < m - 1 && grid[i][j + 1] == 1) {
                    grid[i][j + 1] = 2;
                    fresh--;
                    q.add(new int[]{i, j + 1});
                }
            }
        }

        return fresh == 0 ? minutes : -1;
    }
}
