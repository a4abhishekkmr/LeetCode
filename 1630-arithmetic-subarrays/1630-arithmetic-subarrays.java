class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        //Brute force is cleary visible for me
        
        int n=l.length;
        
        List<Boolean> ans=new ArrayList<>(n);
        
        for(int i=0;i<n;i++)
        {
            int lo=l[i];
            int hi=r[i];
            
            int b[] = Arrays.copyOfRange(nums, lo,hi+1);
            Arrays.sort(b);
            
            //print
            for(int j=0;j<b.length;j++)
                System.out.print(b[j]+" ");
            System.out.println();
            
            ans.add(check(b));
        }
        return ans;
    }
    private boolean check(int []arr)
    {
        
        if(arr.length<=2) return true;
        int diff=Math.abs(arr[1]-arr[0]);
        
        for(int i=2;i<arr.length;i++)
        {
            if(Math.abs(arr[i]-arr[i-1])!=diff)
                return false;
        }
        return true;
    }
}