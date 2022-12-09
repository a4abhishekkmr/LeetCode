class Solution {
    public String decodeString(String s) {
        //I will use StringBuilder instead of the String for saving time comp as str works as backup mode while stringBuilder work as snapshot.
        StringBuilder sb=new StringBuilder();
        
        //taking two Stacks which will store number and String which we will multiply later.
        Stack<Integer> nums=new Stack<>();
        Stack<String> str=new Stack<>();
        int n=s.length();
        
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            
            if(Character.isDigit(ch))
            {
                int num=ch-'0';
                while(i+1<n && Character.isDigit(s.charAt(i+1)))
                {
                    num=num*10+ s.charAt(i+1)-'0';
                    i++;
                }
                nums.push(num);
            }
            else if(ch=='[')
            {
                str.push(sb.toString());
                //now to emoty sb 
                //i can use two methods set lenth 0 or sb=new Substring but new sub, is slower becuse of new allocation
                sb.setLength(0);
                //sb=new StringBuilder();
            }
            
            else if(ch==']')
            {
                int times=nums.pop();
                StringBuilder temp=new StringBuilder(str.pop());
                for(int x=0;x<times;x++)
                    temp.append(sb);
                
                sb=temp;
            }
            else
                sb.append(ch);
        }
            
        return sb.toString();
    }
}

// class Solution {
//     public String decodeString(String s) {
//         Stack<Integer> numStack = new Stack();
//         Stack<String> strStack = new Stack();
//         StringBuilder sb = new StringBuilder();
//         int len = s.length();
//         for(int i=0;i< len ; i++){
//             char ch = s.charAt(i);
//             if(Character.isDigit(ch)){
//                 int num = ch -'0';
//                 while(i+1 <len && Character.isDigit(s.charAt(i+1))){
//                     num = num*10 +s.charAt(i+1) - '0';
//                     i++;
//                 }
//                 numStack.push(num);
//             }else if(ch == '['){
//                 strStack.push(sb.toString());
//                 sb = new StringBuilder();
//             }else if(ch==']'){
//                 int k = numStack.pop();
//                 StringBuilder temp = new StringBuilder(strStack.pop());
//                 for(int j=0;j<k;j++){
//                     temp.append(sb);
//                 }
//                 sb=temp;
//             }else{
//                 sb.append(ch);
//             }
//         }    
//         return sb.toString();
//     }
// }