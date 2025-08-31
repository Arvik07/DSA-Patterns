class Solution {
    public void sortColors(int[] nums) {
        int curr=0;
        int low=0;
        int high = nums.length-1;
        while(curr<=high){
            if(nums[curr]==0){
                //swap
                int temp = nums[low];
                nums[low]=nums[curr];
                nums[curr]=temp;
                low++;
                curr++;
            }
            else if(nums[curr]==1){
                curr++;
            }
            else if(nums[curr]==2){
                int temp = nums[high];
                nums[high]=nums[curr];
                nums[curr]=temp;
                high--;
            }
        }
    }
}