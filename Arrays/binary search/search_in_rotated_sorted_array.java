class Solution {
    public int search(int[] nums, int target) {
        int ptr2=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                ptr2 = i+1;
                break;
            }
        }

        if(ptr2 == 0){
            int SI = 0;
            int EI = nums.length - 1;
            while(SI<=EI){
                int mid = (SI+EI)/2;
                if(nums[mid]==target){
                    return mid;
                }
                if(nums[mid]>target){
                    EI=mid-1;
                }
                if(nums[mid]<target){
                    SI=mid+1;
                }
            }
        }

        if(target>=nums[0]){
            // 1st array:
            int SI1 = 0;
            int EI1 = ptr2-1;
            while(SI1<=EI1){
                int mid1 = (SI1+EI1)/2;
                if(nums[mid1]==target){
                    return mid1;
                }
                if(nums[mid1]>target){
                    EI1=mid1-1;
                }
                if(nums[mid1]<target){
                    SI1=mid1+1;
                }
            }
        }
        else{// 2nd array:
            int SI2 = ptr2;
            int EI2 = nums.length-1;
            while(SI2<=EI2){
                int mid2 = (SI2+EI2)/2;
                if(nums[mid2]==target){
                    return mid2;
                }
                if(nums[mid2]>target){
                    EI2=mid2-1;
                }
                if(nums[mid2]<target){
                    SI2=mid2+1;
                }
            }
        }
        return -1;
    }       
}