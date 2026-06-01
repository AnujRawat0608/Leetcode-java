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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currPath = new ArrayList<>();
        findPaths(root,targetSum,0,currPath,result);
        return result;
    }
    private void findPaths(TreeNode node, int targetSum, int currentSum, List<Integer>currPath,List<List<Integer>> result){
        if(node == null){
            return;
        }
        currPath.add(node.val);
        currentSum += node.val;

        if(node.left == null && node.right == null){
            if(currentSum == targetSum){
                result.add(new ArrayList<>(currPath));
            }
            
        }else{
        findPaths(node.left,targetSum,currentSum,currPath,result);
        findPaths(node.right,targetSum,currentSum,currPath,result);
        }
        currPath.remove(currPath.size() -1);
    }
}