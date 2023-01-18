class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        //ok so approach of this solution will be like
        //normal maxsum we can find using Kandane's algo-
        // https://leetcode.com/problems/maximum-subarray/
        //now
        /*
        we need to find the special sum which is in circular form
        ..so finally our answer will be max(maxSum,SpecialSum)
        and to find special sum we can do is
        we can find the min subarray and substracting it from the sum will return us max(special)
        
        lets suppose X X X Y Y Y Y X X X this is the nums array and then if we need special one
        then if mid part of Y Y Y Y has min value as subarray then substarct that thing then we will be left with X X X X . . . . X X and this is the max of SpecialSUm
        
        Steps:-
        calculate maxSum using Kandane's Algo
        calculate min sum again using kadane(change max as min)
        Calulate sum of all elements
        
        if(all neg)-> minsum=sum then return maxSum, else max(maxSum,Totalsum-minSum);
        
        ,
        code:-
        */
        int currMax=0,currMin=0,sum=0,maxSum=nums[0],minSum=nums[0];
        
        for(int x:nums)
        {
            currMax=Math.max(currMax,0)+x;
            maxSum=Math.max(maxSum,currMax);
            //kandane maxSum]
            currMin=Math.min(currMin,0)+x;
            minSum=Math.min(minSum,currMin);
            //kandane minsum
            
            sum+=x;
        }
        return sum==minSum?maxSum:Math.max(maxSum,sum-minSum);
        
    }
}