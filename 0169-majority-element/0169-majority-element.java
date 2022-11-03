class Solution {
    public int majorityElement(int[] nums) {
        //since its appearing more than n/2. so i can clearly say that if i sort it and return the mid one will give me the ansswe
        
        Arrays.sort(nums);
        return (nums[nums.length/2]);
    }
}