class Solution {
    public String removeOuterParentheses(String s) {
        //1st Approach
        //USing counter.. I will take '(' as -1 and ')' as +1 and when we will find 0 means there is a primitive decomposition
        
        //for ex: - "(()())(())" this has decomposition of "(()())" and "(())"
        
        //how we get this is when we start for "(()())" we will have -1-1+1.. -1+1-1 and total sum will be 0. so break and we need to put chars from 1 to second last
        
        String ans="";
        
//         int count=0;
//         int covered=0;
//         for(int i=0;i<s.length();i++)
//         {
//             char ch=s.charAt(i);
//             if(ch=='(') count--;
//             else count++;
            
//             if(count==0 && i!=0)
//             {
//                 ans+=s.substring(covered+1,i);
//                 covered=i+1;
//             }
//         }
//         return ans;
        
        
        //2nd Method
        //Using Stack
        
        Stack<Character> st=new Stack<>();
        
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            
            if(ch=='(')
            {
                if(st.size()>0)
                    ans+=ch;
                
                st.push(ch);
            }
            else
            {
                st.pop();
                if(!st.isEmpty())
                    ans+=ch;
            }//empty when break
        }
        return ans;
    }
}