class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;
        ArrayList<TreeNode> path1 = new ArrayList<>();
        ArrayList<TreeNode> path2 = new ArrayList<>();
        getpath(root, p, path1);
        getpath(root, q, path2);
        int i = 0;
        for (; i < path1.size() && i < path2.size(); i++) {
            if (path1.get(i) != path2.get(i)) {
                return path1.get(i - 1);
            }
        }
        return path1.get(i - 1);
    }

    public boolean getpath(TreeNode root, TreeNode p, ArrayList<TreeNode> path) {
        if (root == null) return false;
        path.add(root);
        if (root == p) return true;
        if (getpath(root.left, p, path) || getpath(root.right, p, path)) {
            return true;
        }
        path.remove(path.size() - 1); 
        return false;
    }
}
