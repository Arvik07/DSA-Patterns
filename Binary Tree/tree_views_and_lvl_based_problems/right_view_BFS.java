class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if (root == null) return ans;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int size = q.size(); // number of nodes in this level
            for (int i = 0; i < size; i++) {
                TreeNode curr = q.poll();
                // last node in this level is the rightmost one
                if (i == size - 1) {
                    ans.add(curr.val);
                }
                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }
        }
        return ans;
    }
}
