class Solution {
    public int[] getOrder(int[][] tasks) {
        //ok so this is a simple problem based on min heap. we will take a priorityqueue and make a minheap
        //and then will fetch the min processing time at a current t;
        
        
        //just a declaration
        PriorityQueue<int[]> heap=new PriorityQueue<int[]>((a,b)-> (a[1]!=b[1])?(a[1]-b[1]):(a[2]-b[2]));
        
        
        //now a new array that will be sorted based on processing time or min index
        
        int sortedTasks[][]=new int[tasks.length][3];
        for(int i=0;i<tasks.length;++i)
        {
            sortedTasks[i][0]=tasks[i][0];
            sortedTasks[i][1]=tasks[i][1];
            sortedTasks[i][2]=i;
        }
        
        Arrays.sort(sortedTasks,(a,b)-> Integer.compare(a[0],b[0]));
        int orderAns[]=new int[tasks.length];
        
        long curr=0;
        int taskIndex=0;
        int ansIndex=0;
        //now this while loop will stop when no tasks left in array and heap
        
        while(taskIndex<tasks.length ||!heap.isEmpty())
        {
            if(heap.isEmpty() && curr<sortedTasks[taskIndex][0])
            {
                // When the heap is empty, try updating currTime to next task's enqueue time. 
                curr=sortedTasks[taskIndex][0];
            }
            //push all tasks whose enquetime<=currtime into the heap
            while(taskIndex<tasks.length && curr>=sortedTasks[taskIndex][0])
            {
                heap.add(sortedTasks[taskIndex]);
                ++taskIndex;
            }
            
            int processTime=heap.peek()[1];
            int index=heap.peek()[2];
            heap.remove();
            
            // Complete this task and increment currTime.
            curr+=processTime;
            orderAns[ansIndex++]=index;
        }
        return orderAns;
    }
}
/*
Time complexity: O(NlogN).

We create sortedTasks, which is a deep copy of the tasks array. This takes O(N)O(N) time.
Sorting the sortedTasks array takes O(NlogN) time.
We push and pop each task once in the min-heap, and both the operations take O(\log N)O(logN) time for each element. Thus, it takes O(N \log N)O(NlogN) time in total.
Thus, overall time complexity is,O(N+NlogN+NlogN)≈O(NlogN).


Space complexity: O(N)O(N).
Our sortedTasks array will store all NN tasks, and the min-heap will also contain at most NN tasks.
*/
        