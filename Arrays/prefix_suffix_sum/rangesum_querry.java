class NumArray {
    public int prefixsum[];
    public NumArray(int[] nums) {
        prefixsum= new int[nums.length+1];
        prefixsum[0]=0;
        for(int i = 1 ;i<=nums.length;i++){
            prefixsum[i]=prefixsum[i-1]+nums[i-1];
        }
    }
    
    public int sumRange(int left, int right) {
        return prefixsum[right+1]-prefixsum[left];
    }
}