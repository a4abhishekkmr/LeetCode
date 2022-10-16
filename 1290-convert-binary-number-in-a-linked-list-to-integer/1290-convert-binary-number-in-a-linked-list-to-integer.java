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
    public int getDecimalValue(ListNode head) {
        
        //first find the total length
        ListNode curr=head;
        int count=0;
        while(curr!=null)
        {
            count++;
            curr=curr.next;
        }
        
        //now maths
        curr=head;//reset
        int sum=0;
        while(curr!=null)
        {
            sum+=curr.val*Math.pow(2,--count);//due to pow 0
            curr=curr.next;
        }
        return sum;
    }
}

//2nd Method
// class Solution {
//     public int getDecimalValue(ListNode head) {
//         int ans = 0;
//         while(head!=null){
//             ans *= 2;
//             ans += head.val;
//             head = head.next;
//         }
        
//         return ans;
//     }
// }