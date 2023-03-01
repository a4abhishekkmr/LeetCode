class Solution {
    public int[] sortArray(int[] nums) {
        //we can use quick sort or merge sort
        //i am goig with merge sort
        
        mergeSort(nums,0,nums.length-1);
        return nums;
    }
    public void mergeSort(int[] arr,int l,int r)
    {
        if (l >= r) {
            return;
        }
        
            int m=(l+r)/2;
            mergeSort(arr,l,m);
            mergeSort(arr,m+1,r);
            merge(arr,l,m,r);
        
    }
    
    public void merge(int[]arr,int l,int m,int r)
    {
        int n1=m-l+1;
        int n2=r-m;
        int left[]=new int[n1],right[]=new int[n2];
        
        for(int i=0;i<n1;i++)
            left[i]=arr[l+i];
        
        for(int j=0;j<n2;j++)
            right[j]=arr[m+1+j];
        
        int i=0,j=0,k=l;
        
        while(i<n1 && j<n2)
        {
            if(left[i]<=right[j])
            {arr[k]=left[i];
             k++;i++;}
            else
            {
               arr[k]=right[j];
             k++;j++; 
            }
        }
        while(i<n1)
        {
           arr[k]=left[i];
             k++;i++; 
        }
        while(j<n2)
        {
            arr[k]=right[j];
             k++;j++; 
        }
    }
}