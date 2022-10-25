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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
//         int length=0;
//         //find length
        
//         ListNode ptr=head;
//         while(ptr!=null)
//         {ptr=ptr.next;
//             length++;}
        
//         int index=length-n;
        
//         if(index==0)
//         {
//             head=head.next;
//             return head;
//         }
//         //this is the index of prev element of deleting element
//         //3
//         //resetting ptr
//         ptr=head;
//         for(int i=0;i<index-1;i++)
//             ptr=ptr.next;
        
//         ptr.next=ptr.next.next;
        
//         return head;
        
        
        //2nd Method
        //fast and slow
        
        ListNode dummy = new ListNode(-1,head);//2 eleements
        
        ListNode fast=dummy,slow=dummy;
        
        for(int i=0;i<n;i++)
            fast=fast.next;
        
        while(fast.next!=null)
        {
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        
        return dummy.next;
    }
}