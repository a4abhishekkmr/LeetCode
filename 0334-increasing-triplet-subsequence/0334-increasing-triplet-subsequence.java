class Solution {
    public boolean increasingTriplet(int[] nums) {
        //we can do blindly by o(n^3) but we not need that
        //we need to use some logic to solve this efficienly
        
//         Intuition :

// We need to check if any strictly increasing sequence of size 3 present in the array.
// For this, we can keep iterating the given array from left to right, and changing our FirstMinimumValue and SecondMinimumValue.
// If any number comes, which is greater than SecondMinimumValue then this shows that, we have found a triplet with increasing subsequence. => return true.
// If after whole iteration, above statement is not returning any answer, then this shows no increasing triplet present in the array. => return false at the end.
        
        //code
        //change kro 2 min values ko ni kia to triplet pakda jaega
        int min1=Integer.MAX_VALUE,min2=Integer.MAX_VALUE;
        
        for(int x:nums)
        {
            if(x<=min1) min1=x;
            else if(x<=min2) min2=x;
            else return true;
        }
        return false;
    }
}
//Another good solution 
//https://leetcode.com/problems/increasing-triplet-subsequence/discuss/2688485/Two-Approaches-oror-Easy-To-Understand-oror-C%2B%2B-Code

//image to understand is in posted comment
//https://assets.leetcode.com/users/images/cb59fde1-9ceb-449a-a9fb-9b518cc3285a_1665555946.0283813.png