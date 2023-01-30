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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr=new ListNode(0,head);
        
        ListNode prev=curr;
        
        while(head!=null)
        {
            //catch the same
            if(head.next!=null && head.val==head.next.val)
            {
                //upto where
                while(head.next!=null && head.val==head.next.val)
                {
                    head=head.next;
                }
                //skipped all
                prev.next=head.next;///head stops then the next will be linked to prev next
            }
            else
                prev=prev.next;//normal iteration
            
            head=head.next;
        }
        
        return curr.next;
    }
}