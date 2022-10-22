class Solution {
    public void rotate(int[] nums, int k) {
        //USe extra SPaxe
        int n=nums.length;
        int aux[]=new int[n];
        if(k>=n) k=k%n;
        for(int i=n-k;i<n;i++)
        {
            aux[i+k-n]=nums[i];
        }
        for(int i=0;i<n-k;i++)
            aux[i+k]=nums[i];
        
        for(int i=0;i<n;i++)
            nums[i]=aux[i];
    }
}