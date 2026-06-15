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
    public ListNode deleteMiddle(ListNode head) {
        ListNode prevSlow = null;
        ListNode  slow = head;
        ListNode  fast = head;


        while(fast != null && fast.next != null){
            prevSlow = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if(prevSlow  == null){
            return null;
        }
        prevSlow.next = slow.next;
        return head; 
        }
    
}
/*

given -  head of a linked list
To do -  delete the middle node and return the head of the mofified linked list
middle node = n / 2


*/
