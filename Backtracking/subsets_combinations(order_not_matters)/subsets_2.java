public import java.util.*;
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        Arrays.sort(nums); // step 1: sort input
        generateSubsets(nums , 0 , current , result);
        return result;
    }

    public void generateSubsets(int arr[] , int index , List<Integer>current ,List<List<Integer>>result){
        result.add(new ArrayList<>(current));
        for(int i = index; i<arr.length; i++){
            if (i > index && arr[i] == arr[i - 1]) {
                continue;
            }
            current.add(arr[i]);
            generateSubsets(arr, i+1,current, result);
            current.remove(current.size() - 1);
        }
    }
}