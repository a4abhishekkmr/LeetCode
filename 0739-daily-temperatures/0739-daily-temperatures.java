class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        //Next Greater Element
        //only difference is here we are dealing with length not element
        
        int n=temperatures.length;
        int ans[]=new int[n];
        
        Stack<Integer> st=new Stack<>();
        
        for(int i=0;i<n;i++)
        {
            while(!st.isEmpty() && temperatures[i]>temperatures[st.peek()])
            {
                ans[st.peek()]=i-st.peek();
                st.pop();
            }
            st.push(i);//main khela
        }
        
        return ans;
    }
}