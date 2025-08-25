import java.util.*;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        generateSubsets(nums, 0, current, result);
        return result;
    }

    public void generateSubsets(int[] nums, int index, List<Integer> current, List<List<Integer>> result) {
        // add current subset
        result.add(new ArrayList<>(current));

        // try including each element starting from "index"
        for (int i = index; i < nums.length; i++) {
            current.add(nums[i]);                     // choose element
            generateSubsets(nums, i + 1, current, result); // explore further
            current.remove(current.size() - 1);       // backtrack
        }
    }
}
