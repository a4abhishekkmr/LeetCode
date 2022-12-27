class Solution {
    public int shipWithinDays(int[] weights, int days) {
        /* ok so this will be a long theory to solve this problem
        the problem says i need min weight capacity of the ship so that i can solve this 
        the min weight must be the max weight of the weights[] as if i choose lesser than that then
        we will not be able to fill that thing into the ship.
        so our min value is set that we need to find weight greater than that
        but what about the max weight value
        so 
        it can be max to max sum of all weights[i] as may be we need to do all the shipment in one day
        and to do this in 1 day we need to find sum of all weights[i]
        
        ok if we solve this manually then we need to strugle with tle as 
        Because, in the worst case, we might need to check the ship's capacity from the largest weight to
        the sum of all elements in weights. The sum of all elements can reach n * 500, since 500 is the
        maximum weight we can have as per the problem constraints. So, we might need to check O(n \cdot
        500)O(n⋅500) different values of ship capacity. For each capacity, we need to iterate over all 
        the elements of weights to check whether we can ship the packages in the required number of days
        or not, this would require O(n)O(n) time. As a result, the total time required would be=O(n^2⋅500) which would lead to TLE.
        
        Faster way is to go with Binary Search
        we have L and R so we need to find the min val lies between L and R that satisfies the condn
        and it can be satisfied with the help of Binary Search lets do the code now
        
        */
        int maxLoad=0;int sum=0;
        for(int x:weights)
        {
            if(maxLoad<x) maxLoad=x;
            sum+=x;
        }
        
        int lo=maxLoad,hi=sum;
        
        while(lo<hi)
        {
            int mid=(lo+hi)/2;
            if(possible(weights,mid,days))
                hi=mid;//left search
            else
                lo=mid+1;
        }
        return lo;//(l==r)
    }
    
    boolean possible(int[] weights,int mid,int days)
    {
        int dayNeeded=1,load=0;
        for(int x:weights)
        {
            load+=x;
            if(load>mid)
            {
                dayNeeded++;
                load=x;
            }
        }
        return dayNeeded<=days;
    }
}