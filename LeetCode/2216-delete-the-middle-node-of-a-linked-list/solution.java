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
        if (head == null || head.next == null) {
            return null;
        }
        ListNode tor = head;
        ListNode rab = head.next.next;

        while(rab!=null&&rab.next!=null){
            rab = rab.next.next;
            tor = tor.next; 
        }
        tor.next = tor.next.next;
        return head;
    }
}
