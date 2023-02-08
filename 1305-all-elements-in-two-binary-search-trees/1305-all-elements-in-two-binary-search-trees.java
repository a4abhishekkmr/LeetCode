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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> al=new ArrayList<>();
        
        inorder(root1,al);
        inorder(root2,al);
        
        Collections.sort(al);
        return al;
    }
    //inorder traversal
    private void inorder(TreeNode root,ArrayList<Integer> al)
    {
        if(root!=null)
        {
            inorder(root.left,al);
            al.add(root.val);
            inorder(root.right,al);
        }
    }
}