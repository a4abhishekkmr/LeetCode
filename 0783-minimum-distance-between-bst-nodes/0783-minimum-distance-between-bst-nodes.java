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
    
    List<Integer> al=new ArrayList<>();
    
    private void inorder(TreeNode root)
    {
        if(root!=null)
        {
            inorder(root.left);
            al.add(root.val);
            inorder(root.right);
        }
        else return;
    }
    public int minDiffInBST(TreeNode root) {
        
        inorder(root);
        int min=Integer.MAX_VALUE;
        
        for(int i=1;i<al.size();i++)
        {
            min=Math.min(min,al.get(i)-al.get(i-1));
        }
        
        return min;
    }
}