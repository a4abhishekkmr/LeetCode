//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(read.readLine().trim());
        while(T-->0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int arr[]= new int[N];
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            Solution ob = new Solution();
            int[] ans = ob.leafNodes(arr, N);
            for(int i = 0; i < ans.length; i++)
            {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution
{
    public int[] leafNodes(int arr[], int N)
    {
        // code here
        ArrayList<Integer> al=new ArrayList<>();
        Stack<Integer> st=new Stack<>();
        
        st.push(arr[0]);
        
        for(int i=1;i<N;i++)
        {
            if(arr[i]<st.peek())
            st.push(arr[i]);
            else
            {
                int size=st.size();
                int top=st.peek();
                while(!st.isEmpty() && arr[i]>st.peek())
                st.pop();
                
                st.push(arr[i]);
                
                if(size>st.size())
                al.add(top);
            }
        }
        al.add(st.peek());
        
        int ans[]=new int[al.size()];
        for(int i=0;i<al.size();i++)
        ans[i]=al.get(i);
        
        return ans;
    }
}

    //   vector<int>v;
    //   stack<int>s;
    //   s.push(arr[0]);

    //   for(int i=1;i<N;i++)
    //   {
    //       if(arr[i]<s.top())
    //       s.push(arr[i]);
    //       else
    //       {
    //           int size=s.size();
    //           int x=s.top();
    //           while(!s.empty() && arr[i]>s.top()){
    //                  s.pop();
    //           }
               
    //           s.push(arr[i]);

    //           if(size>s.size())
    //           v.push_back(x);

    //       }
    //   }

    //   v.push_back(s.top());

    //   return v;