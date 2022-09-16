class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> al= new ArrayList<>();
            
            
            
            for(int i=0;i<l.length;i++)
            {
                    int n=r[i]-l[i]+1;
                    int temp[]=new int[n];
                    int pos=0;
                    for(int j=l[i];j<=r[i];j++)
                    {
                            temp[pos++]=nums[j];
                           // System.out.println(temp[pos-1]);
                    }
                    
                    boolean ans=checkIsAP(temp,n);
                    
                    al.add(ans);
            }
            
            return al;
    }
boolean checkIsAP(int arr[], int n)
    {
        if (n == 1)
            return true;
         
        // Sort array
        Arrays.sort(arr);
         
        // After sorting, difference between
        // consecutive elements must be same.
        int d = arr[1] - arr[0];
        for (int i = 2; i < n; i++)
            if (arr[i] - arr[i-1] != d)
                return false;
         
        return true;
        
    }
}