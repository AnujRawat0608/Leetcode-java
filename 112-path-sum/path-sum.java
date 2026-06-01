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
    private boolean inorder(TreeNode root , int sum , int targetSum){
        if(root == null){
            return false;
        }
        sum += root.val;
        if(root.left == null && root.right == null){
            return sum == targetSum;
        }
        
        boolean left = inorder(root.left,sum,targetSum);
        boolean right = inorder(root.right, sum, targetSum);

        return left || right;
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return inorder(root,0,targetSum);
    }
}