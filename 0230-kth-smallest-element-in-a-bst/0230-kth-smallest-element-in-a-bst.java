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
    public int kthSmallest(TreeNode root, int k) {
        //To solve the problem, one could use the property of BST : inorder traversal of BST is an array sorted in the ascending order.
        
        //recursive inorder method
        //tc-O(N) sc-O(n)
        
        ArrayList<Integer> arr=inorder(root,new ArrayList<>());
        
        return arr.get(k-1);
    }
    
    public ArrayList<Integer> inorder(TreeNode root, ArrayList<Integer> arr)
    {
        if(root==null) return arr;
        inorder(root.left,arr);
        arr.add(root.val);
        inorder(root.right,arr);
        
        return arr;
    }
}