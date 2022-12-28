class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        //lets go with that way
        /*
        if my trucksize is 1, then i need to choose the max number of boxes a boxtype has
        so i will choose the max numberOfUnitsPerBox
        I need to sort the boxtypes with help of numberOfUnitsPerBox in descending
        Iterate on the box types and take from each type as many as you can.
        now also anther problem is we cannot put this as a hashmap key value pair as that will be flop
        idea because the key needs to be unique and both numberOfUnits and numberOfUnitsPerBox can't be 
        unique.
        so to solve this we may need to make a pair class and then with help of heap 
        we can sort it in descending order.
        */
        

//Approach
//Let us sort the array according to 'units' value. The maxHeap can be used with greedy approach.

//Complexity
//Time complexity: O(n*log(n))
//Space complexity: O(n)
        
        //code
        PriorityQueue<int[]> heap=new PriorityQueue<>((a,b)-> Integer.compare(b[1],a[1]));
        
        //now add all arrays
        for(int i=0;i<boxTypes.length;i++)
            heap.offer(boxTypes[i]);//added as an array
        
        //now sorted arrays feeded in pq
        
        int[] boxAndUnitCount;
        int totalUnitsStored=0;
        
        while(!heap.isEmpty() && truckSize>0)
        {
            boxAndUnitCount=heap.poll();
            
            if(truckSize>=boxAndUnitCount[0])
            {
                totalUnitsStored+=boxAndUnitCount[0]*boxAndUnitCount[1];
            }
            else//however the size left
            {
                totalUnitsStored+=truckSize*boxAndUnitCount[1];
            }
            //reduce trucksize after loading
            truckSize-=boxAndUnitCount[0];
        }
        
        return totalUnitsStored;
    }
}