class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        boolean iszero[][]=new boolean[m][n];

        // Pass 1: Mark original zeros
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    iszero[i][j]=true;
                }
            }
        }

        // Pass 2: Apply zeroing
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(iszero[i][j]){
                    // zero row
                    for(int col=0;col<n;col++){
                        matrix[i][col]=0;
                    }
                    // zero column
                    for(int row=0;row<m;row++){
                        matrix[row][j]=0;
                    }
                }
            }
        }
    }
}
