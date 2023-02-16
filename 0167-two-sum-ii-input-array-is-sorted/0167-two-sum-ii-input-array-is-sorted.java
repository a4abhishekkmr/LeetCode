class Solution {
    public int[] twoSum(int[] nums, int target) {
        //1st method using HAshmap
//         HashMap<Integer,Integer> hm=new HashMap<>();
        
//         int ans[]=new int[2];
        
//         for(int i=0;i<nums.length;i++)
//         {
//             if(hm.containsKey(target-nums[i]))
//             {
//                 ans[0]=hm.get(target-nums[i])+1;
//                 ans[1]=i+1;
//                 return ans;
//             }
//             hm.put(nums[i],i);
//         }
//         return ans;
        
        //2ND METHOD
        //USE OF SORTED ARRAY
        
        int ans[]=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            int val= bsearch(nums,target-nums[i]);
            if(val!=-1)
            {
                if(val<i)
                {
                    ans[0]=val+1;
                    ans[1]=i+1;
                    
                }
                else if(val==i)
                {ans[0]=i+1;
                 ans[1]=i+2;
                }
                else
                {
                ans[0]=i+1;
                 ans[1]=val+1;
                }
                return ans;
            }
        }
        return ans;
    }
    private int bsearch(int []arr,int find)
    {
        int lo=0,hi=arr.length-1;
        while(lo<=hi)
        {
            int mid=lo+(hi-lo)/2;
            if(arr[mid]==find)
                return mid;
            else if(arr[mid]>find)
                hi=mid-1;
            else
                lo=mid+1;
        }
        return -1;
    }
    //tc-O(n*logn) and sc-O(1)
}