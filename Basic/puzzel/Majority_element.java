import java.util.HashMap;

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int num = nums[i];
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            if (countMap.get(num) > n / 2) {
                return num; 
            }
        }

        return -1; 
    }
}
