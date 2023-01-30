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
    public ListNode swapPairs(ListNode head) {
        //checking for length 0 or 1
        if(head==null || head.next==null) return head;
        //taking two pointers in 1st and second position
		
        ListNode slow=head;
        ListNode fast=head.next;
        
        while(fast!=null && fast.next!=null )
        {//swap
            int temp=slow.val;
            slow.val=fast.val;
            fast.val=temp;
			//move 2 steps ahead both pointers
            fast=fast.next.next;
            slow=slow.next.next;
        }
		//for even i need to swap again
        if(fast!=null)
        {
            int temp=slow.val;
            slow.val=fast.val;
            fast.val=temp;
        }
        
        return head;
    }
}