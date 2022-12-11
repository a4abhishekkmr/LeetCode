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
    private int  max=Integer.MIN_VALUE;
    
    public int maxPathSum(TreeNode root) {
        
        maxinSubtree(root);
        return max;
    }
    private int maxinSubtree(TreeNode root)
    {
        if(root==null) return 0;
//         int leftsum=Math.max(maxinSubtree(root.left),0);//to ignore -ve number
//         int rightsum=Math.max(maxinSubtree(root.right),0);//to ignore -ve number because it will always reduces the sum
        
//         max=Math.max(max,leftsum+rightsum+root.val);
        
//         return Math.max(leftsum,rightsum)+root.val;
        
        int left=maxinSubtree(root.left);
        int right=maxinSubtree(root.right);
        int value=root.val;
        if(left>=0){
           value+=left;
        }

        if(right>=0){
           value+=right;
        }

        max=Math.max(max,value);
        
        if(left<0 && right<0)return root.val;
        return root.val+Math.max(left,right);
    }
}