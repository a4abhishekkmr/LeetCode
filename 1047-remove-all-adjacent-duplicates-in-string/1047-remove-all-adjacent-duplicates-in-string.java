class Solution {
    public String removeDuplicates(String s) {
        //use Stack
        //if same on peek. remove it
        
        Stack<Character> st=new Stack<>();
        
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            
            if(st.isEmpty())
            {
            st.push(ch);
            }
            else if(st.peek()==ch)
                st.pop();
            else
                st.push(ch);
            
        }
        StringBuilder sb=new StringBuilder();
        
        while(!st.isEmpty())
        {
            sb.append(st.pop());
        }
        
        return sb.reverse().toString();
    }
}