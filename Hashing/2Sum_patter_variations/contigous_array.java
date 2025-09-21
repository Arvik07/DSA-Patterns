import java.util.*;

class Solution {
    public int findMaxLength(int[] nums) {
        // hashmap to store sum -> first index where sum occurs
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        hm.put(0, -1); // sum 0 occurs before array starts

        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < nums.length; i++) {
            // convert 0 to -1
            int value;
            if (nums[i] == 0) {
                value = -1;
            } else {
                value = 1;
            }

            sum = sum + value;

            // check if this sum has been seen before
            if (hm.containsKey(sum)) {
                int prevIndex = hm.get(sum);
                int length = i - prevIndex;
                if (length > maxLen) {
                    maxLen = length;
                }
            } else {
                // store first occurrence of this sum
                hm.put(sum, i);
            }
        }

        return maxLen;
    }
}
