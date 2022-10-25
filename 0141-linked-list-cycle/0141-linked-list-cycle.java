/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        //HashSet wont work
        //Some of the other Simple methods are
//         1st to Modify the Data type of Linked List. it would then contains data pointer and a visited boolean data that will tell that next's node is already visited
            
//             2nd Method is to point all iterated nodes to a dummy node then last nod's next will be already pointed to dummy node tetcects the cycle
            
            //Use Floyd cycle Detection Algorithm
        
        ListNode slow=head,fast=head;
        
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast) return true;
        }
        return false;
    }
}