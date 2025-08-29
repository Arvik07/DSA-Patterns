class Solution {
    public int prefix[];
    public int suffix[];
    public int[] productExceptSelf(int[] nums) {
        int output[]=new int[nums.length];
        prefixprod(nums);
        suffixprod(nums);
        for(int i = 0;i<nums.length;i++){
            if(i==0){
                output[0]=suffix[1];
            }
            else if(i==nums.length-1){
                output[i]=prefix[nums.length-2];
            }
            else{
                output[i]=prefix[i-1]*suffix[i+1];
            }
        }
        return output;
    }

    public void prefixprod(int nums[]){
        prefix = new int[nums.length];
        prefix[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            prefix[i]=prefix[i-1]*nums[i];
        }        
    }
    public void suffixprod(int nums[]){
        suffix = new int[nums.length];
        suffix[nums.length-1]=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            suffix[i]=suffix[i+1]*nums[i];
        }
    }
}