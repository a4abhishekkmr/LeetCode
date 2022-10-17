class NumArray {

    int prefix[];
    public NumArray(int[] nums) {
        prefix=new int[nums.length];
        
        int prev=0;
        for(int i=0;i<nums.length;i++)
        {prev=nums[i]+prev;
            prefix[i]=prev;}
        
    }
    
    public int sumRange(int left, int right) {
        if(left==0) return prefix[right];
        
        else
            return prefix[right]-prefix[left-1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */