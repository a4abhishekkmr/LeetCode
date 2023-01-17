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
    public boolean isPalindrome(ListNode head) {
        ListNode temp=head;
        int n=0;
        while(temp!=null)
        {
            n++;
            temp=temp.next;
        }
        
        int arr[]=new int[n];
        temp=head;
        
        int i=0;
        while(temp!=null)
        {
            arr[i++]=temp.val;
            temp=temp.next;
        }
        
        int lo=0,hi=n-1;
        
        //checking time
        while(lo<hi)
        {
            if(arr[lo]!=arr[hi])
                return false;
            lo++;hi--;
        }
        return true;
    }
}