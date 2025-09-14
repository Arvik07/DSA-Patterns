class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        List<Integer> curr = new ArrayList<>();
        int n = 0; 

        while (!q.isEmpty()) {
            TreeNode now = q.remove();

            if (now == null) {
                ans.add(new ArrayList<>(curr));
                curr.clear();

                if (!q.isEmpty()) q.add(null);

                n++; 
            } else {
                if (n % 2 == 0) {
                    curr.add(now.val); 
                } else {
                    curr.add(0, now.val); 
                }

                if (now.left != null) q.add(now.left);
                if (now.right != null) q.add(now.right);
            }
        }

        return ans;
    }
}
