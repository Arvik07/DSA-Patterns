/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        helper(root,targetSum,ans,current);
        return ans;
    }
    public List<List<Integer>> helper(TreeNode root, int targetSum,List<List<Integer>> ans,List<Integer> current){
        if(root==null){
            return ans;
        }
        current.add(root.val);
        targetSum = targetSum- root.val;
        if(targetSum==0 && root.left==null && root.right==null){
            ans.add(new ArrayList(current));
        }
        helper(root.left,targetSum,ans,current);
        helper(root.right,targetSum,ans,current);
        current.remove(current.size()-1);
        return ans;

    }
}