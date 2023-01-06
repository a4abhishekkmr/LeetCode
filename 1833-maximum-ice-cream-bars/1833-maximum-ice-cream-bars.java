/*
We are given some coins and an array costs of ice cream prices. We need to check the maximum number of ice creams we can buy with the given coins, where we can only select one ice cream once.

One way is to try every possibility. For each ice cream, we have two choices, take it (if we have enough coins), or don't take it.
When we make a decision for one ice cream, we have the same subproblem with the remaining ice creams. Thus, this problem follows the optimal substructure property and can be solved with dynamic programming (memoization/tabulation) like a 0/1 Knapsack problem.

Here, we will not discuss that solution as it is very inefficient and will result in Time Limit Exceeded. But you can try it on your own for better learning.

*/
class Solution {
    public int maxIceCream(int[] costs, int coins) {
        //sort the cost and pass with +1 if cost <=coins available
        
        Arrays.sort(costs);
        
        int n=costs.length;
        int count=0;
        
        while(count<n && costs[count]<=coins)
        {
            coins-=costs[count];
            count++;
        }
        return count;
    }
}
//tc-O(n log n)