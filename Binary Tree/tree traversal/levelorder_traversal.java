class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        } 
        lvlorder(root, result);
        return result;
    }

    public void lvlorder(TreeNode root, List<List<Integer>> result) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        List<Integer> current = new ArrayList<>();

        while (!q.isEmpty()) {
            TreeNode currnode = q.remove();
            if (currnode == null) {
                result.add(current);
                if (q.isEmpty()) break;
                current = new ArrayList<>();  
                q.add(null);
            } else {
                current.add(currnode.val);
                if (currnode.left != null) q.add(currnode.left);
                if (currnode.right != null) q.add(currnode.right);
            }
        }
    }
}
