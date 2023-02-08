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
    int sum=0;
    public TreeNode bstToGst(TreeNode root) {
        //its like inorder but with some modifications like it will starts from right and maintain a sum
        
        //so right root left...  right will goes to the deepest right
        
        if(root==null) return null;
            //  basically we have to move till the right most node first 
        bstToGst(root.right);
        sum+=root.val;
        root.val=sum;
        
        //backtrack 
        
        bstToGst(root.left);
        
        
        return root;
    }
}//tc-O(N) and space-O(h)