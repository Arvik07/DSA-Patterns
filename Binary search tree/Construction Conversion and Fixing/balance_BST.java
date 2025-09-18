class Solution {
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> seq = new ArrayList<>();
        inorder(root, seq);
        return helper(seq, 0, seq.size() - 1);
    }

    private static void inorder(TreeNode root, ArrayList<Integer> seq) {
        if (root == null) return;
        inorder(root.left, seq);
        seq.add(root.val);  
        inorder(root.right, seq);
    }

    private static TreeNode helper(ArrayList<Integer> seq, int start, int end) {
        if (start > end) return null;

        int mid = (start + end) / 2;
        TreeNode root = new TreeNode(seq.get(mid));

        root.left = helper(seq, start, mid - 1);
        root.right = helper(seq, mid + 1, end);

        return root;
    }
}
