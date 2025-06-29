public class Solution {
    public TreeNode pruneTree(TreeNode root) {
        if (root == null) return null;

        // Recursively prune left and right subtrees first
        root.left = pruneTree(root.left);
        root.right = pruneTree(root.right);

        // If this node is 0 and both subtrees are null, prune it
        if (root.val == 0 && root.left == null && root.right == null) {
            return null;
        }

        return root; // otherwise, keep the node
    }
}