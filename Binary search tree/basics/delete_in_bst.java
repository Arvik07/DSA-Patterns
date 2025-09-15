class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }

        if (key < root.val) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.val) {
            root.right = deleteNode(root.right, key);
        } else {
            // Found the node to delete
            // Case 1: leaf node
            if (root.left == null && root.right == null) {
                return null;
            }
            // Case 2: one child
            if (root.left == null) {
                return root.right;
            }
            if (root.right == null) {
                return root.left;
            }
            // Case 3: two children
            TreeNode successor = inorderSuccessor(root.right);
            root.val = successor.val;
            root.right = deleteNode(root.right, successor.val);
        }
        return root;
    }

    public static TreeNode inorderSuccessor(TreeNode node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }
}
