class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        permutation(nums, used , result, current);
        return result;
    }
    public void permutation(int nums[],boolean[] used ,List<List<Integer>>result,List<Integer>current){
        if(current.size()==nums.length){
            result.add(new ArrayList<>(current));
        }
        // try each number
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) {
                continue; // skip if already taken
            }
            current.add(nums[i]);   
            used[i] = true;          
            permutation(nums,used,result,current); 
            current.remove(current.size() - 1);     
            used[i] = false;          
        }
    }
}