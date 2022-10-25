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
    public ListNode removeElements(ListNode head, int val) {
        
        if(head==null) return head;
        if(val==0) return head;
        //corner cases covered
        
        while(head!=null && head.val==val)
        {head=head.next;}
         
         ListNode curr=head;
        
        while(curr!=null && curr.next!=null)
        {
            if(curr.next.val==val)
                curr.next=curr.next.next;//2 times shift to skip
            
            else
                curr=curr.next;
        }
        
        return head;
    }
}