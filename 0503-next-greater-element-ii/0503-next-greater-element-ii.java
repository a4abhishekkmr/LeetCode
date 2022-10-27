class Solution {
    public int[] nextGreaterElements(int[] nums) {
        //These Questions are borned to use Special features of Stacks called Monotonic Stack
        //A monotonic stack is a stack whose elements are monotonically increasing or descreasing.
        //for more details:-
        //https://liuzhenglaichn.gitbook.io/algorithm/monotonic-stack
        
        int n=nums.length;
        
        int ans[]=new int[n];
        
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--)
        {
            st.push(nums[i]);
        }
        
        for(int i=n-1;i>=0;i--)
        {
            while(!st.isEmpty() && st.peek()<=nums[i])
                st.pop();
            
            ans[i]=st.isEmpty()?-1:st.peek();
            st.push(nums[i]);
        }
        
        return ans;
    }
}
//lets have a dry run for this... 
/*Taking example of [1,2,3,4,3] 
initally my stack will have-> 3 at bottom as 3,4,3,2,1
    now at i=4, number=3 we will pop 1,2,3 as these are equal to 3 
    now st.peek()=4 so my ans will be 0,0,0,0,4
    stack updated to 3,4,3
    
    for i=3 we have num=4 and in while loop all popped out as <=4 so stack empty returns-1
        so my ans will be 0,0,0,-1,4
    stack updated to 4
        
    now at i=2, number=3 we will not pop anything 
    now st.peek()=4 so my ans will be 0,0,4,-1,4
    stack updated to 4,3
        
    now at i=1, number=2 we will not pop anything 
    now st.peek()=3 so my ans will be 0,3,4,-1,4
    stack updated to 4,3,2
        
    now at i=0, number=1 we will not pop anything 
    now st.peek()=2 so my ans will be 2,3,4,-1,4
    stack updated to 4,3,2,1 and returned answer
    */