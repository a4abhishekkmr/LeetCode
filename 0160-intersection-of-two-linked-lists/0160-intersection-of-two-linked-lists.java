/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        ListNode d1=headA;
        HashMap<ListNode,Integer> hm=new HashMap<>();
        while(d1!=null)
        {
            hm.put(d1,d1.val);
            d1=d1.next;
        }
        
        ListNode d2=headB;
        while(d2!=null)
        {
            if(hm.containsKey(d2))
                return d2;
            d2=d2.next;
        }
        return null;
    }
}