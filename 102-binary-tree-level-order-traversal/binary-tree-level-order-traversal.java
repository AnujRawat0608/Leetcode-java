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
    public List<List<Integer>> levelOrder(TreeNode root) {
       List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;  // Handle empty tree

        Queue<TreeNode> treeNodeQueue = new LinkedList<>();
        treeNodeQueue.add(root);

        while (!treeNodeQueue.isEmpty()) {
            int levelSize = treeNodeQueue.size();  // Number of nodes in current level
            List<Integer> currentLevel = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                TreeNode treeNode = treeNodeQueue.poll();  // Use poll() instead of pop()
                currentLevel.add(treeNode.val);

                if (treeNode.left != null)
                    treeNodeQueue.add(treeNode.left);
                if (treeNode.right != null)
                    treeNodeQueue.add(treeNode.right);
            }
            result.add(currentLevel);
        }
        return result;
    }
}