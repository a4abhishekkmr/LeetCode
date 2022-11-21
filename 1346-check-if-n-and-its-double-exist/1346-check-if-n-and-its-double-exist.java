class Solution {
    public boolean checkIfExist(int[] arr) {
       if(arr == null || arr.length<2) return false;

    Arrays.sort(arr);// sorting the array 

    for(int i=0;i<arr.length;i++) // runnig loop till arr length
    {   int current_val=arr[i]; // inserting arr values into this using this asa target in bianry search
        int value = Arrays.binarySearch(arr,2*arr[i]); // running binary search on array and on current value 
        if(value >= 0 && value !=i) // checking if their index doesn't match then it's true 
        {
            return true;
        }
    }
    return false;// othwerwise false 
    }
}