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
    
    //post order traversal
    public boolean evaluateTree(TreeNode root) {
        if(root.left == null && root.right == null) return root.val == 0 ? false : true;
        
        boolean left=evaluateTree(root.left);
        boolean right=evaluateTree(root.right);
        
        return evaluate(root.val,left,right);
        
    }
    
    private boolean evaluate(int symbol,boolean left,boolean right)
    {
        if(symbol==2)
        {
            return (left||right);
            
        }
        else
        {
             return (left&&right);
        }
    }
}

//Tc-O(n) and space-O(h)