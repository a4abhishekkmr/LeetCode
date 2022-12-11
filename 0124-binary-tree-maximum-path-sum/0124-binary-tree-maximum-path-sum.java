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
    private int  max;
    
    public int maxPathSum(TreeNode root) {
        max=Integer.MIN_VALUE;
        maxinSubtree(root);
        return max;
    }
    private int maxinSubtree(TreeNode root)
    {
        if(root==null) return 0;
        int leftsum=Math.max(maxinSubtree(root.left),0);
        int rightsum=Math.max(maxinSubtree(root.right),0);
        
        max=Math.max(max,leftsum+rightsum+root.val);
        
        return Math.max(leftsum+root.val,rightsum+root.val);
    }
}