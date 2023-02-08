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
    //iterate put and then sort
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

//tc-O(Nlogn)for sorting +O(N)+O(N) for traversals so finally O(nlogn)
//space-O(H) for traversals and aux space of al is taken.