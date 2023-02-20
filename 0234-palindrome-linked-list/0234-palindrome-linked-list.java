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
// class Solution {
//     public boolean isPalindrome(ListNode head) {
//         ListNode temp=head;
//         int n=0;
//         while(temp!=null)
//         {
//             n++;
//             temp=temp.next;
//         }
        
//         int arr[]=new int[n];
//         temp=head;
        
//         int i=0;
//         while(temp!=null)
//         {
//             arr[i++]=temp.val;
//             temp=temp.next;
//         }
        
//         int lo=0,hi=n-1;
        
//         //checking time
//         while(lo<hi)
//         {
//             if(arr[lo]!=arr[hi])
//                 return false;
//             lo++;hi--;
//         }
//         return true;
//     }
// }


//Follow up: Could you do it in O(n) time and O(1) space?

class Solution{
    public boolean isPalindrome(ListNode head) {
        //find mind
        ListNode slow=head,fast=head;
        
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }
        
        ListNode prev=null;//tail
        
        while(slow!=null)
        {
            ListNode temp=slow.next;
            
            slow.next=prev;
            prev=slow;
            slow=temp;
        }
        
        //now compare the first and second half
        ListNode left=head,right=prev;
        while(right!=null)
        {
            if(left.val!=right.val) return false;
            
            left=left.next;
            right=right.next;
        }
        return true;
    }
}