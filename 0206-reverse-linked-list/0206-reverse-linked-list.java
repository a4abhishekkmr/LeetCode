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
    public ListNode reverseList(ListNode head) {
        //1st Approach
        //I will use Stack for this put all in stack and then pop
//         Stack<Integer> st = new Stack<>();
        
//         ListNode curr=head;
        
//         while(curr!=null)
//         {
//             st.add(curr.val);
//             curr=curr.next;
//         }
        
//         curr=head;//Assemble time
//         while(curr!=null)
//         {
//             curr.val=st.pop();
//             curr=curr.next;
//         }
        
//         return head;
        
        //2nd approach
//While traversing through the list, first we store the next in temp,
//second assign  curr->next to prev, third assign prev to curr because this is the case in the next iteration, 
// the forth step assign curr to orginal curr->next(that is temp)
//return prev because the last value's next will be null and that is where the while loop stops at the time prev 
// will be the last node of the orginal list now that we reversed it return it(it's the new head now)
        
        ListNode prev=null,curr=head;
        while(curr!=null)
        {
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;//prev because of the curr is equals to null here
    }
}