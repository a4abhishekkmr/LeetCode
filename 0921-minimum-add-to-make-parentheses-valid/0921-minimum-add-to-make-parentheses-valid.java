class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st=new Stack<>();
        
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==')')
            {
                if(!st.isEmpty() && st.peek()=='(')
                    st.pop();
                else
                    st.push(s.charAt(i));
            }
            else
                st.push(s.charAt(i));
        }
        
        return st.size();
    }
}