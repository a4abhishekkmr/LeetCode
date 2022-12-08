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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        //iterate over the tree and find the leaf of all the trees and finally compare them.
        
        ArrayList<Integer> leaf1=new ArrayList<>();
        ArrayList<Integer> leaf2=new ArrayList<>();
        
        findleaf(root1,leaf1);
        findleaf(root2,leaf2);
        
        return leaf1.equals(leaf2);
    }
    
    private void findleaf(TreeNode root,List<Integer> al)
    {
        if(root!=null)
        {
            if(root.left==null && root.right==null)
                al.add(root.val);
            findleaf(root.left,al);
            findleaf(root.right,al);
        }
    }
    
    //tc:- O(n+m) n and m are lengths of the trees
    //sc:- O(n+m) stacks using space in dfs recursion
}