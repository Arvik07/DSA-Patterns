class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int ans[] = new int[n]; 
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
        }
        for(int i =0;i<n;i++){
            nums[(i+k)%n]=ans[i];
        }
    }
}