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

//https://leetcode.com/problems/add-two-numbers/discuss/1835535/JavaC%2B%2B-A-very-beautiful-explanation-EVER-exists

/*
 // To remember: 
 // 1. Numbers are in reverse order and there are no leading zeroes: 
 // -- Thus, we can start adding from the heads of the linked list.
 // 2. It is guaranteed that node values are integers in the range [0,9]. 
//  -- Thus, we don't need any other checks before summing,
*/
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //Abhishek
        ListNode dummy = new ListNode(),
						result = dummy;
        
        int carry=0;
        
        while(l1!=null || l2!=null)
        {
            int sum=carry;
            // One of the numbers could have lesser digits than the other.
			// Thus, we check for the presence of the digits first and then add them to the sum.
            if(l1!=null)
            {
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2!=null)
            {
                sum+=l2.val;
                l2=l2.next;
            }
            
            
    // After this the sum would be like: sum = carry + l1.val + l2.val, if both l1 and l2 are not null.
			// Now, if sum >= 10, we will have the case of a carry.
			// These are base 10 numbers.
// Thus, a digit that needs to be added would be: digit = sum % 10 and carry would be carry = carry/10;
			// Consider that sum = 9. In that case, digit is 9 and carry is 0.
			// Consider that sum is 21. In that case, digit is 1 and carry is 2.
		// Thus, our result would be accurate for all cases - whether sum is greater than 10 or not.
            //sum+=carry;
            
            dummy.next = new ListNode(sum%10);
            carry=sum/10;
            //temp.next=node;
            dummy=dummy.next;
        }
        
        //if carry is remaining then we need to add it as a next Node
        if(carry==1)
        {dummy.next = new ListNode(1);
            dummy=dummy.next;}
        
        return result.next;
    }
}