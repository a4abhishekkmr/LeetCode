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
    public TreeNode bstFromPreorder(int[] preorder) {
        //use for loops that will make easy soln
        TreeNode root=new TreeNode(preorder[0]);
        for(int i=1;i<preorder.length;i++)
        {
            construct(root,preorder[i]);
        }
        
        return root;
    }
    
    private TreeNode construct(TreeNode root,int val)
    {
        if(root==null) return new TreeNode(val);//this is making new nodes
        if(root.val>val)///left
            root.left=construct(root.left,val);
        else
            root.right=construct(root.right,val);
        
        return root;
    }
    
}