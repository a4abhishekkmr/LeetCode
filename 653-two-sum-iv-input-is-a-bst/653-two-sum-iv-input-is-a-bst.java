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
    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> hs=new HashSet<>();
        
        TreeNode curr=root;
        return find(curr,hs,k);
    }
    private boolean find(TreeNode root,HashSet<Integer> hs, int k)
    {
        if(root==null) return false;
        
        if(hs.contains(k-root.val)) return true;
        
        hs.add(root.val);
        
        return find(root.left,hs,k)||find(root.right,hs,k);
    }
}