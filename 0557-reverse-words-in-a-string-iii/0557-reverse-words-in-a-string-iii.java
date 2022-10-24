class Solution {
    public String reverseWords(String s) {
        //okay so what idea comes to mind is split the String into arrayOfString and then reverse each words and then join them by space separated b/w them.
            
            String[] arrOfStr = s.split(" ");
            
            for(int i=0;i<arrOfStr.length;i++)
            {
                    arrOfStr[i]=Reverse(arrOfStr[i]);
            }
            
            String str = String.join(" ", arrOfStr);
            
            return str;
    }
        String Reverse(String str)
        {
                int n=str.length();
                StringBuilder ans=new StringBuilder();
                if(n==0) return ans.toString();
                for(int i=n-1;i>=0;i--)
                {
                        ans.append(String.valueOf(str.charAt(i)));
                }
                return ans.toString();
        }
}