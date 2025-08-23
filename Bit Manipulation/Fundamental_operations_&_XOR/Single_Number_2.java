class Solution {
    public int singleNumber(int[] nums) {
        int ones = 0, twos = 0;

        for(int i =0;i<nums.length;i++){
            // Add num to 'twos' if it's already in 'ones'
            twos = twos | (ones & nums[i]);
            // XOR will add num to 'ones' or remove if already present
            ones = ones ^ nums[i];
            // Common mask for clearing bits appearing 3 times
            int common_mask = ~(ones & twos);            
            ones = ones & common_mask;
            twos = twos & common_mask;
        }
        return ones;
    }
}