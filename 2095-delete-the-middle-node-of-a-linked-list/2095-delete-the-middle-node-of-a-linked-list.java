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
        //Either you can count the number of elements and then iterate to half -1 and cross the half element
        //or else legendry fast and slow
        if(head.next==null) return null;
        
        ListNode fast=head,slow=head;
        
        while(fast.next.next!=null && fast.next.next.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        
        return head;
    }
}