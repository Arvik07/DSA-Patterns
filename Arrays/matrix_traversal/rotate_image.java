class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int matrix2[][] = new int[n][n];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                matrix2[i][j]=matrix[i][j];
            }
        }
        int row=0;
        int col=n-1;
        while(row<n && col>=0){
            for(int i=0;i<n;i++){
                matrix[i][col]=matrix2[row][i];
            }
            row++;
            col--;
        }
        
    }
}