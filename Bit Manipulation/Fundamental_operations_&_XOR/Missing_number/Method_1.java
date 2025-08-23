class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum_final = 0;
        int total_sum=n*(n+1)/2;
        for(int i=0;i<n;i++){
            sum_final = sum_final+nums[i];
        }
        return (total_sum-sum_final);

    }
}