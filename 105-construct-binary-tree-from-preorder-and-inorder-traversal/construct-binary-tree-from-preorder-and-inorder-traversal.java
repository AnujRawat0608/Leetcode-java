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

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder, inorder, 0, preorder.length - 1, 0, inorder.length - 1);
    }

    private TreeNode build(int[] preorder, int[] inorder,
                           int preStart, int preEnd,
                           int inStart, int inEnd) {

        // Base case: no elements left
        if (preStart > preEnd || inStart > inEnd) {
            return null;
        }

        // Root value is always the first element in preorder range
        int rootVal = preorder[preStart];
        TreeNode root = new TreeNode(rootVal);

        // Find root in inorder (to split left and right subtree)
        int mid = inStart;
        while (mid <= inEnd && inorder[mid] != rootVal) {
            mid++;
        }

        // Count how many nodes are in the left subtree
        int leftSize = mid - inStart;

        // ---------- Build left subtree ----------
        root.left = build(preorder, inorder,
                preStart + 1,                     // start after root
                preStart + leftSize,              // end of left subtree
                inStart,                          // inorder left start
                mid - 1);                         // inorder left end

        // ---------- Build right subtree ----------
        root.right = build(preorder, inorder,
                preStart + leftSize + 1,          // start after left subtree
                preEnd,                           // preorder end
                mid + 1,                          // inorder right start
                inEnd);                           // inorder right end

        return root;
    }
}
