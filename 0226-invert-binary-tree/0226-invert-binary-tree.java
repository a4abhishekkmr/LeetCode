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
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        TreeNode tmp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(tmp);
        return root;
    }
}


/**Iterative Approach:**/
// Runtime: 1 ms, faster than 90.96% of Java online submissions for Invert Binary Tree.
// Time Complexity : O(n)
// Space Complexity : O(n)
// class Solution {
//     public TreeNode invertTree(TreeNode root) {
//         LinkedList<TreeNode> q = new LinkedList<TreeNode>();
//         // Base case: if the tree is empty...
//         if(root != null){
//             // Push the root node...
//             q.add(root);
//         }
//         // Loop till queue is empty...
//         while(!q.isEmpty()){
//             // Dequeue front node...
//             TreeNode temp = q.poll();
//             // Enqueue left child of the popped node...
//             if(temp.left != null)
//                 q.add(temp.left);
//             // Enqueue right child of the popped node
//             if(temp.right != null)
//                 q.add(temp.right);
//             // Swapping process...
//             TreeNode curr = temp.left;
//             temp.left = temp.right;
//             temp.right = curr;
//         }
//          return root;    // Return the root...
//     }
// }*/