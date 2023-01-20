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
    
    /*Approach
Find the maximum depth of the left and right child separately
Check the difference is below 1
Return immediately if the condition fails at any level
Complexity
Time complexity:
O(N)

Space complexity:
O(1)
*/
    
    public boolean isBalanced(TreeNode root) {
        
        return height(root,1)>0;
    }
    private int height(TreeNode root,int height)
    {
        if(root==null) return height;//false as 1 passed
        
        int left=height(root.left,height+1);
        int right=height(root.right,height+1);
        
        if(Math.abs(left-right)>1) return -1;
        return Math.max(left,right);//true
    }
}