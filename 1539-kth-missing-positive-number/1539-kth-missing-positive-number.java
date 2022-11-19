class Solution {
    public int findKthPositive(int[] arr, int k) {
        boolean missing[]=new boolean[1001+k];
        
        for(int x:arr)
        {
            missing[x]=true;
        }
        //
        // for(int i=1;i<15;i++)
        // System.out.print(missing[i]+" ");
        int i=0;int j=1;
        while(i<k)
        {
            if(missing[j]==false)
            i++;
            j++;
        }
        return j-1;
    }
}