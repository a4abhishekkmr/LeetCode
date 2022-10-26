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
        
        //since its sorted then no need for an Extra space of Hashset and all
        if(head==null) return head;
        if(head.next==null) return head;
        if(head.next.next==null && head.val!=head.next.val) return head;
        else if(head.next.next==null && head.val==head.next.val) 
        {
            head=head.next;
            return head;
        }
        ListNode curr=head;
        
        while(curr!=null && curr.next!=null)
        {
            int temp=curr.val;
            int next=curr.next.val;
            System.out.println(temp+" gaya aur paya "+next);
            if(temp==next)
                curr.next=curr.next.next;
            
            else
            curr=curr.next;
        }
        return head;
    }
}