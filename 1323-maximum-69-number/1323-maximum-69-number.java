class Solution {
    public int maximum69Number (int num) {
        //make it string and start from left side to find the 6 if present then just convert it to 9. thats it
            
            String s=Integer.toString(num);
            
            for(int i=0;i<s.length();i++)
            {
                    if(s.charAt(i)=='6')
                    {s = s.substring(0,i) + '9' + s.substring(i + 1);break;}
            }
            
            int ans=Integer.valueOf(s);
            return ans;
    }
}