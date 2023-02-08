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
//the solution is bit different. 
//please note this is not an bonary search tree its normal binary tree
//This is also called a Cartesian Tree. One interesting property is that if we do an in-order 
//traversal, we get the array back which we used to create it.
class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return makethetree(nums,0,nums.length);
    }
    
    //function which will make the tree
    private TreeNode makethetree(int[] nums,int i,int j)
    {
        if(i==j) return null;
        int max_index=maxIndex(nums,i,j);
        TreeNode root=new TreeNode(nums[max_index]);
        
        root.left=makethetree(nums,i,max_index);
        root.right=makethetree(nums,max_index+1,j);
        
        return root;
    }
    
    public int maxIndex(int[] nums,int l,int r)
    {
        int index=l;//imp
        for(int i=l;i<r;i++)
            if(nums[i]>nums[index])
                index=i;
        
        return index;
    }
    
}

//tc- O(n^2) as searching max and then iterating array both will take O(n)
//sc-O(n) due to recursion