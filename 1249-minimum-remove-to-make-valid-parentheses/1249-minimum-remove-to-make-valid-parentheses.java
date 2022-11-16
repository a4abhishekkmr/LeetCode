class Solution {
    public String minRemoveToMakeValid(String s) {
        
        StringBuilder sb=new StringBuilder(s);
        Stack<Integer> st=new Stack<>();
        
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
                st.push(i);
            else if(s.charAt(i)==')')
            {
                if(!st.isEmpty() && s.charAt(st.peek())=='(')
                    st.pop();
                else
                    st.push(i);
            }
        }
        
        while(!st.isEmpty())
        {
            sb.deleteCharAt(st.pop());
        }
        
        return sb.toString();
    }
}