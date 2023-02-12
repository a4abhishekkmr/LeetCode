class Solution {
    public long findTheArrayConcVal(int[] nums) {
        int n=nums.length;
        
        int i=0,j=n-1;
        long sum=0;
        while(i<=j)
        {
            if(i==j)
            {
            int a=nums[i];
            
            
            
            sum+=a;
            i++;j--;
            }
            else
            {
            int a=nums[i];
            int b=nums[j];
            String a1=Integer.toString(a);
            String a2=Integer.toString(b);
            i++;j--;
                
                String a3=a1+a2;
                
                sum+=Integer.parseInt(a3);
            }
        }
        return sum;
    }
}