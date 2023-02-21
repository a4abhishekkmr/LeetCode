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
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1==null) return root2;
        if(root2==null) return root1;
        
        TreeNode newNode=new TreeNode(root1.val+root2.val);
        
        newNode.left=mergeTrees(root1.left,root2.left);
        newNode.right=mergeTrees(root1.right,root2.right);
        
        return newNode;
    }
}
// //TreeNode left= mergeTrees(root1.left, root2.left);//recursing down the left subtree and knowing about the left child 
//         TreeNode right= mergeTrees(root1.right, root2.right);//recursing down the right subtree and knowing about the right child 
      
//         //ROOT
//         //creating the node by the total information received from left and right child 
//         TreeNode node= new TreeNode(root1.val+root2.val, left, right);
      
//         return node;//returning the node in order to maintain the backward modified link at each instant//Telling to the parent that I am present  
//     }

/*class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) 
    {
        Stack <TreeNode> s = new Stack <TreeNode>();
        s.push(t1);
        s.push(t2);
        if (t1 == null)
            return t2;
 
        while(!s.isEmpty())
        {
            TreeNode two = s.pop();
            TreeNode one = s.pop();
            
            if (one != null && two != null)
            {
                one.val += two.val;
                if (one.left == null){
                    one.left = two.left;
                }
                else
                {
                    s.push(one.left);
                    s.push(two.left);
                }
                      
                if (one.right == null){
                    one.right = two.right;
                }
                else
                {
                    s.push(one.right);
                    s.push(two.right);
                }  
            }     
        }
        return t1;  
    }
}
*/