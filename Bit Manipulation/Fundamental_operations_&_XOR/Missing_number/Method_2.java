class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int XORall = 0;
        int XORnums = 0;
        for(int i = 0 ;i<=n;i++){
            XORall = XORall ^ i;
        }
        for(int i = 0;i<nums.length;i++){
            XORnums = XORnums ^nums[i];
        }
        return XORnums ^ XORall ;
    }

}