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
    public int sumOfLeftLeaves(TreeNode root) {
        sumOfLeftLeaves(root,0);
        return sum;
        
    }
    //i=1 -- means left leaf
    public void sumOfLeftLeaves(TreeNode root,int i) {
        if(root==null)
            return;
        else if(root.left==null && root.right==null){
            sum+= (i==1)?root.val:0;
        }else{
            sumOfLeftLeaves(root.left,1);
            sumOfLeftLeaves(root.right,0);
        }
    }
}