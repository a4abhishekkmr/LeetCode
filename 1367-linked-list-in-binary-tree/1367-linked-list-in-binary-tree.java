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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSubPath(ListNode head, TreeNode root) {
        if(head==null && root==null) return true;
        //all null means all set
        
        if(root==null) return false;//means linkedlist have some elements and tree dont have
        
        boolean res=traverse(head,root);
        
        return res||isSubPath(head,root.left)||isSubPath(head,root.right);
        //find for bwlow elements that weather they have the linkedlist elements
        
    }
    
    private boolean traverse(ListNode head, TreeNode root)
    {
        if(root==null && head==null) return true;//all found
        
        if(root==null) return false; //again underflow
            
        if(head==null) return true;//means all of the linkedlist found then why to traverse
        
        if(head.val!=root.val) return false;//diff
        
        return traverse(head.next,root.left)||traverse(head.next,root.right);
        
    }
}