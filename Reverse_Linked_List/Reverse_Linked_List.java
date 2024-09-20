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
    public ListNode reverseList(ListNode head) {
        //point to head
        ListNode cur = head;
        //point to prev
        ListNode prev = null;

        if(cur == null) {
            return head;
        }
        //While cur still exists
        while(cur != null) {
            //set temp to the next node
            ListNode temp = cur.next;
            //Set the next node to the previous node
            cur.next = prev;
            //Set the previous node to the cur node
            prev = cur;
            //set the cur node to temp
            cur = temp;
        }
        return prev;
    }
}