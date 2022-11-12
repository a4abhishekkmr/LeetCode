class Solution {
    public int removeDuplicates(int[] nums) {
        //ok so i have to take it as a two pointer where the first pointer will be crossing same elements and another is ready to swap the numbers
        
        int count=0;
        
        int fast=1,slow=0;
        
        while(slow<nums.length)
        {
            int rep=slow+1;
            
            while(rep<nums.length && nums[slow]==nums[rep])
                rep++;
            
            if(rep<nums.length && fast<nums.length && fast!=rep)
            nums[fast]=nums[rep];
            
            slow=rep;
            fast++;
            count++;
        }
        return count;
    }
}


//Another solution
/*
class Solution {
   public int removeDuplicates(int[] nums) {
		if (nums.length == 0 || nums.length == 1) {
			return nums.length;
		}
		int j = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] != nums[i + 1]) {
				nums[j++] = nums[i];
			}
		}
		nums[j++] = nums[nums.length - 1];
		return j;
	}
}
*/