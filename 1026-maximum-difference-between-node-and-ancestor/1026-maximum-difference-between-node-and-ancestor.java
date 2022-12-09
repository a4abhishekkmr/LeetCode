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
    
    private int ans=0;
    public int maxAncestorDiff(TreeNode root) {
        //okay so what i got from hint is to 
//manage max and min for all the subtrees
        
        preorder(root,root.val,root.val);
        return ans;
    }
    
    private void preorder(TreeNode root,int min,int max)
    {
        if(root==null) return;
        
        max=Math.max(max,root.val);
        min=Math.min(min,root.val);
        
        if(root.left==null && root.right==null)
        {
            ans=Math.max(ans,max-min);
            return;
        }
        
        preorder(root.left,min,max);
        preorder(root.right,min,max);
    }
}