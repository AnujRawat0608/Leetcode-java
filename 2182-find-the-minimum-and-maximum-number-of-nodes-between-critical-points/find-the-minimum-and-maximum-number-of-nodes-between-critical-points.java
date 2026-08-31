/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {

        int[] result = {-1,-1};

        if(head == null || head.next == null || head.next.next == null){
            return result;
        }
        ListNode prev = head;
        ListNode curr = head.next;

        int position = 2;

        int firstCritical = -1;
        int previousCritical = -1;
        
        int minDistance = Integer.MAX_VALUE;
        int maxDistance = -1;

        while(curr.next != null){

            boolean isCritical = 
            (curr.val > prev.val && curr.val > curr.next.val) ||
            (curr.val < prev.val && curr.val < curr.next.val);
            
            if(isCritical){
                if(firstCritical == -1){
                    firstCritical = position;
                }
                else{
                    minDistance = Math.min(minDistance, position - previousCritical);
                    maxDistance = position - firstCritical; 
                }
                previousCritical = position;
            }
            prev = curr;
            curr = curr.next;
            position ++;
    }
    if(previousCritical == firstCritical){
        return result;
    }

    return new int[]{minDistance, maxDistance};


}
}