class Solution {
    public int maxLevelSum(TreeNode root) {
        int h = height(root);
        int maxSum = Integer.MIN_VALUE;
        int levelWithMax = 1;

        for (int i = 1; i <= h; i++) {
            int currSum = helper(root, 1, i);
            if (currSum > maxSum) {
                maxSum = currSum;
                levelWithMax = i;
            }
        }
        return levelWithMax;
    }

    public int helper(TreeNode root, int lvl, int k) {
        if (root == null) return 0;

        if (lvl == k) return root.val;

        return (helper(root.left, lvl + 1, k) + helper(root.right, lvl + 1, k));
    }

    public int height(TreeNode root) {
        if (root == null) return 0;
        return Math.max(height(root.left), height(root.right)) + 1;
    }
}
