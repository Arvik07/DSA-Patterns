class Solution {
    public int totalHammingDistance(int[] nums) {
        int total = 0;  
        int n = nums.length;           

        for (int bit = 0; bit < 32; bit++) {
            int ones = 0;         
            for (int i = 0; i < n; i++) {   
                if (((nums[i] >> bit) & 1) == 1) {
                    ones++;
                }
            }
            total = total + ones * (n - ones);
        }
        return total;
    }
}
