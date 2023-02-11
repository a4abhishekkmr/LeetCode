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
    public TreeNode reverseOddLevels(TreeNode root) {
        traverse(root.left,root.right,1);
        return root;
    }
    
    public void traverse(TreeNode l,TreeNode r,int level)
    {
        if(l==null || r==null) return;
        if(level%2==1)
        {
            int temp=l.val;
            l.val=r.val;
            r.val=temp;
        }
        
        traverse(l.left,r.right,level+1);
        traverse(l.right,r.left,level+1);
    }
}