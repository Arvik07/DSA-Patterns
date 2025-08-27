class Solution {
    int rows,cols,mx=0;
    public int getMaximumGold(int[][] grid) {
        rows=grid.length;
        cols=grid[0].length;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]!=0){
                    mx=Math.max(mx,dfs(0,i,j,grid));
                }
            }
        }
        return mx;
    }

    private int dfs(int amt,int i,int j, int[][] grid){
        if(i<0||i>=rows||j<0||j>=cols){
            return amt;
        }
        if(grid[i][j]==0)return amt;
        amt+=grid[i][j];
        int gold=grid[i][j];
        grid[i][j]=0;
        int one=dfs(amt,i+1,j,grid);
        int two=dfs(amt,i-1,j,grid);
        int three=dfs(amt,i,j+1,grid);
        int four=dfs(amt,i,j-1,grid);
        grid[i][j]=gold;
        return Math.max(one, Math.max(two,Math.max(three,four)));
    }
}