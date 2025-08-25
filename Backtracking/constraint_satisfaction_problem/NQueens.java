import java.util.*;

class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        
        // create the chess board filled with '.'
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        placeQueens(result, board, 0); // start placing queens from row 0
        return result;
    }

    // try to place a queen in each row
    public void placeQueens(List<List<String>> result, char[][] board, int row) {
        if (row == board.length) {
            // all queens placed, save solution
            result.add(construct(board));
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';        // place queen
                placeQueens(result, board, row + 1); // move to next row
                board[row][col] = '.';        // backtrack (remove queen)
            }
        }
    }

    // check if a queen can be placed at board[row][col]
    public boolean isSafe(char[][] board, int row, int col) {
        // check column (upwards)
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') return false;
        }

        // check upper-left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }

        // check upper-right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') return false;
        }

        return true;
    }

    // convert board to list of strings
    private List<String> construct(char[][] board) {
        List<String> path = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            path.add(new String(board[i]));
        }
        return path;
    }
}
