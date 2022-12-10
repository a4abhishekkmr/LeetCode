// Complexity
// Time complexity:
// $$O(n)$$

// Space complexity:
// $$O(n)$$
class Solution {
    
    long max=0l;
    int MOD = (int)(1e9 + 7);
    
    int totalSum;
    public int maxProduct(TreeNode root) {
        //ok so we have the hint
        //If we know the sum of a subtree, the answer is max( (total_sum - subtree_sum) * subtree_sum) in each node.
        
        //we need to find the sum of the tree
        max=0l;
        totalSum=Sum(root);
        
        subtreeSum(root);
        return (int)(max % MOD);
    }
    
    private int Sum(TreeNode root)
    {
        if(root==null) return 0;//bc
        return root.val+Sum(root.left)+Sum(root.right);
    }
    private int subtreeSum(TreeNode node){
         if(node == null) return 0;
         int substree1Sum = subtreeSum(node.left) + subtreeSum(node.right)+ node.val;
         int substree2Sum = totalSum - substree1Sum;
         max = Math.max(max, (long)substree1Sum * substree2Sum);
         return substree1Sum;
     }
}