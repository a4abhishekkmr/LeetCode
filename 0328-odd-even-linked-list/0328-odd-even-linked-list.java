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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null) return head;
        
        //for this question lets consider it as a array question.
        //naive solution will be to solve it as taking two arrays and store odd and even then merge.
        //but here we are given follow up that we have to solve it in O(1) space and O(n) time comp.
        
        //so i am going with a loop that will have slow and fast pointer and i will switch the value of 
        //nodes if even exists earlier.
        
        /*
        Approach
Maintain two pointers one at index 0 position and other at index 1 position. Now the next of first node should point to the next node of second node since the second node is one step ahead of first node. So we map odd.next = even.next. Now we move odd one step ahead i.e odd=odd.next and now odd is at even.next. Now the next of even should point to next of odd since odd is one step ahead of even and move even one step. Do this till even || even.next != null since even is one step ahead of odd.Now point the next of odd to reference of evenHead to connect even and odd nodes. Simulate the process for better understanding.

Time Comp:- O(n) and space Comp:- O(1)
*/
        ListNode odd=head;
        ListNode even=head.next;
        ListNode evenHead=even;
        
        while(even!=null && even.next!=null)//as even is one step ahead
        {
            odd.next=even.next;//iterate
            odd=odd.next;
            even.next=odd.next;
            even=even.next;
        }
        odd.next=evenHead;
        return head;
} 
}