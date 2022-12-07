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
    
    private int sum=0;
    public int rangeSumBST(TreeNode root, int low, int high) {
       if(root==null) return 0;
        
        
        if(low<=root.val && root.val<=high)
            sum+=root.val;
        if(low<root.val)
            rangeSumBST(root.left,low,high);
        if(high>root.val)
            rangeSumBST(root.right,low,high);
        
        return sum;
    }
}

///Another soln
// if(root == null) return 0;

//         if(root.val < low){   // if current node value is less than low than move it to greater side that is right side
//             return rangeSumBST(root.right, low, high);
//         }else if(root.val > high){  // if current node value is greater than high than move it to lower side that is left side
//             return rangeSumBST(root.left, low, high);
//         }else{  // if it's in range add the current value and repeat for left and right subtree
//             return root.val + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
//         }