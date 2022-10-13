/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        //this idea generates from the thing that node is not last Position so we can do-
        //Copy the value of the next node in the given node.
//Then make the given node point to the node to the next of the next of the given node.
        
        ListNode curr=node;
        
        //copy next element to curr
        curr.val=curr.next.val;
        
        //skip the next curr
        curr.next=curr.next.next;
    }
}