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
    public ListNode sortList(ListNode head) {
        //we can solve this as storing the data in array and then sort the array and then put all the data
        //back to linkedlist
        //but we have follow up that we cant use aux space such as array
        //we need to think it otherwise
        //we can use bubble sort and selection sort but those are O(N^2) and we are limited  to
        //O(nlogn)
        //so for this we need to go with merge sort O(nlogn)
        //quick and merge both will work but quicksort not works efficiently in case of linkedlist
        //lets go with divide and conquer technique of Merge sort
        
       //Space Complexity: \mathcal{O}(\log n)O(logn) , where nn is the number of nodes in linked list. Since the problem is recursive, we need additional space to store the recursive call stack.
        
        if(head==null || head.next==null) return head;
        
        ListNode mid=getMid(head);
        ListNode left=sortList(head);//head to mid as half-> left
        ListNode right=sortList(mid);//mid to tail as half-> right
        return merge(left,right);//merge both the halves
        
    }
    
    
    ListNode getMid(ListNode head)
    {
        ListNode midprev=null;
        
        while(head!=null && head.next!=null)
        {
            midprev=(midprev==null)?head:midprev.next;
            head=head.next.next;
            //2-2 step moving head and when in 1st iteration head is at pos2(1step +2) the midprev will be head
            //as mid will be 1st pos and mid prev must be at 0. and so on
            //next time the mid prev will be at 1st pos and then mid at 2nd pos
        }
        ListNode mid=midprev.next;//centre find out and make it new ll
        midprev.next=null;//breaks it
        return mid;
    }
    
    ListNode merge(ListNode l1,ListNode l2)
    {
        ListNode res=new ListNode();
        ListNode curr=res;
        
        while(l1!=null && l2!=null)
        {
            if(l1.val<l2.val)
            {
                curr.next=l1;
                l1=l1.next;
                curr=curr.next;
            }
            else
            {
                curr.next=l2;
                l2=l2.next;
                curr=curr.next;
            }
        }
        curr.next=(l1!=null)?l1:l2;//left item
        
        return res.next;
    }
}