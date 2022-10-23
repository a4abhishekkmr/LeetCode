class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int start[]=new int[matrix.length];
        
        for(int i=0;i<matrix.length;i++)
        {
            start[i]=matrix[i][0];
        }
        
        int row=findrow(start,target);
        
        //since sorted so will do binary Search
        System.out.print(row);
        return bsearch(matrix,row,target);
    }
    
    private int findrow(int []arr,int val)
    {
        int index=0;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>val)
                return i-1;
        }
        return arr.length-1;
    }
    
    private boolean bsearch(int[][] matrix,int row,int target)
    {
        int lo=0;
        int hi=matrix[0].length-1;
        
        while(lo<=hi)
        {
            int mid=lo+(hi-lo)/2;
            if(matrix[row][mid]==target)
                return true;
            else if(matrix[row][mid]>target)
                hi=mid-1;
            else
                lo=mid+1;
        }
        return false;
    }
}