class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        //ok its very easy. we have to go through the 2 loops for arr1 and arr2. then check the diff if diff ==0 then skip else if diff>0 and less than = d then count++;
        
        int count=0;
        int mark=0;
        for(int i=0;i<arr1.length;i++)
        {
            mark=0;
            for(int j=0;j<arr2.length;j++)
            {
                int diff=Math.abs(arr1[i]-arr2[j]);
                if(diff<=d)
                    j=arr2.length-1;
                else
                    mark++;
            }
            if(mark==arr2.length)
                count++;
        }
        return count;
    }
}