class Solution {
    public boolean containsDuplicate(int[] nums) {
//         Arrays.sort(nums);
        
//         for(int i=0;i<nums.length-1;i++)
//             if(nums[i]==nums[i+1])
//                 return true;
        
//         return false;
        
        HashSet<Integer> hs=new HashSet<>();
        
        for(int i=0;i<nums.length;i++)
        {if(hs.contains(nums[i]))
                return true;
         else
             hs.add(nums[i]);
        }
        
        return false;
    }
}