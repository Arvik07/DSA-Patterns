class Solution {
    public int titleToNumber(String columnTitle) {
        int n = columnTitle.length();
        int ans = 0;
        int k =0;
        for(int i =n-1 ;i>=0;i--){
            ans = ans + (columnTitle.charAt(i)-'A'+1)*(int)Math.pow(26 , k);
            k++;
        }
        return ans;
    }
}