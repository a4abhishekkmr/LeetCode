class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        
        for(int i=0;i<tokens.length;i++)
        {
            char ch=tokens[i].charAt(0);
            if(ch=='-' && tokens[i].length()>1) st.push(Integer.valueOf(tokens[i]));
            else if(ch=='+'||ch=='-'||ch=='*'||ch=='/')
            {
                int b=st.pop();
                int a=st.pop();
                if(ch=='+') st.push(a+b);
                else if(ch=='*') st.push(a*b);
                else if(ch=='-') st.push(a-b);
                else if(ch=='/') st.push(a/b);
                
            }
            else
                st.push(Integer.valueOf(tokens[i]));
        }
        return st.peek();
    }
}