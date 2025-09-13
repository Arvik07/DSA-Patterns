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
    public int pathSum(TreeNode root, int targetSum) {
        int num = 0;
        if(root==null){
            return num;
        }
        num = helper(root,targetSum);
        int ls = pathSum(root.left,targetSum);
        int rs = pathSum(root.right,targetSum);
        return num+ls+rs;
    }
    public int helper(TreeNode root ,long targetSum){
        if(root==null){
            return 0;
        }
        int count =0;
        targetSum = targetSum - root.val;
        if(targetSum==0){
            count ++;
        }
        int left = helper(root.left,targetSum);
        int right = helper(root.right,targetSum);
        return count+left+right;
    }
}