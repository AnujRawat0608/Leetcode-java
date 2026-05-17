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
    public int minDepth(TreeNode root) {


        Queue<TreeNode> queue = new LinkedList<>();//create Queue
        queue.add(root);//add teh root  elemnent in the queue

        if(root == null)return 0;//if root == null return 0

        int depth = 1; // take a variable depth to keep track of the depth
        while(!queue.isEmpty()){ //this will run untill the queue gets empty
            int size = queue.size();//this is the variable in which we store size of the queue

            for(int i=0; i<size; i++){//we are now iterating in the Queue
                TreeNode curr = queue.poll();//we remove the top element from the queue and store it in curr node 

                if(curr.left == null && curr.right == null){//if left and right of the curr are null then return the depth
                    return depth;
                }
                if(curr.left != null){ // if left of curr is not null then add it into the queue
                    queue.add(curr.left);
                }
                if(curr.right != null){ // if right of curr is not null then add it to the queue
                    queue.add(curr.right);
                }
            }
            depth ++; // add the depth accordingly
        }
        return depth; // return the depth
    }
}