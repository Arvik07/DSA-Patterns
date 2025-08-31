class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int sr=0;
        int sc =0;
        int er = m-1;
        int ec = n-1;
        while(sr<=er && sc<=ec){
            for(int i=sc;i<=ec;i++){
                ans.add(matrix[sr][i]);
            }
            sr++;
            for(int j=sr;j<=er;j++){
                ans.add(matrix[j][ec]);
            }
            ec--;
            if(sr<=er){
                for(int k=ec ;k>=sc;k--){
                    ans.add(matrix[er][k]);                
                }
                er--;
            }
            
            if(sc<=ec){
                for(int p=er;p>=sr;p--){
                    ans.add(matrix[p][sc]);                
                }
                sc++;
            }
            
        }
        return ans;
    }
}