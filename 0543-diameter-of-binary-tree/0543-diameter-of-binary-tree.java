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
    
    int diameter=0;
    public int diameterOfBinaryTree(TreeNode root) {
        //sbse phle height nikalo and then find the max off them by left+right height
        
        height(root);
        return diameter;
    }
    
    public int height(TreeNode root)
    {
        if(root==null) return 0;
        
        int leftHeight=height(root.left);
        int rightHeight=height(root.right);
        
        diameter=Math.max(diameter,leftHeight+rightHeight);
        
        return 1+Math.max(leftHeight,rightHeight);
    }
}