class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        
        ///now check
        
        int ans[]=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            if(hm.containsKey(target-nums[i]))
            {
                ans[1]=hm.get(target-nums[i]);
                ans[0]=i;
                return ans;
            }
            hm.put(nums[i],i);//key as numbers and value as their index
        }
        return ans;
    }
}