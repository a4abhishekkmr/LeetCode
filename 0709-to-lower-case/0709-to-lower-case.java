class Solution {
    public String toLowerCase(String str) {
          char s[]=str.toCharArray();
            
            
            for(int i=0;i<s.length;i++)
            {
                    if(s[i]>=65 && s[i]<=90)
                    {
                            s[i]=(char)(s[i]+32);
                    }
            }
            return  String.valueOf(s);
    }
}