class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> hm= new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i],hm.get(nums[i])+1);
            }
            else{
                hm.put(nums[i],1);
            }
            if(hm.get(nums[i])==2){
                ans.add(nums[i]);
            }
        }
        return ans;
    }
}