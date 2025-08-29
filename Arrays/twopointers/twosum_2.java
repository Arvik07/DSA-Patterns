class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0 ;
        int right = numbers.length -1;
        while(left<=right && left<numbers.length && right>=0){
            int sum = numbers[left]+numbers[right];
            if(sum<target){
                left++;
            }
            if(sum>target){
                right--;
            }
            if(sum==target){
                int ans[]=new int[2];
                ans[0]=left+1;
                ans[1]=right+1;
                return ans;
            }
        }
        return new int[]{-1, -1};
    }
}