/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null||root==p||root==q){
            return root;
        }
        TreeNode lca = lowestCommonAncestor(root.left,p,q);
        TreeNode rca = lowestCommonAncestor(root.right,p,q);
        if(lca==null){
            return rca;
        }
        if(rca==null){
            return lca;
        }
        return root;
    }
}