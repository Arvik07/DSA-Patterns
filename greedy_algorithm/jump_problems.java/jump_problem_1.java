class Solution {
    public boolean canJump(int[] nums) {
        int maxIdx = 0;
        int Idx = 0;
        if(nums.length==1){
            if(nums[0]>=1){
                return true;
            }
        }
        for(int i = 0;i<nums.length;i++){
            Idx = i;
            Idx = Idx + nums[i];
            if (i > maxIdx) return false;
            maxIdx = Math.max(Idx,maxIdx);            
            if(maxIdx >= nums.length-1){
                return true;
            }            
        }
        return false;
    }
}