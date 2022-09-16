class Solution {
    public String freqAlphabets(String s) {
        //lets run from back side and if we fetch # then conider for the prev 2 chars and count;
            //i am thinking of taking Stringbuffer which will helps to not to reverse the string formed it will already be in reverse.
            
            
            StringBuffer sb=new StringBuffer();
            int n=s.length();
            int pos=n-1;
            while(pos>=0)
            {
                   if(s.charAt(pos)=='#')
                   {
                           int a=(int)(s.charAt(pos-2)-'0');
                           int b=(int)(s.charAt(pos-1)-'0');
                           int numb=a*10+b;
                           char generate=(char)('a'+numb-1);
                           sb.append(generate);
                           pos=pos-3;
                            System.out.println(numb);
                   }
                    else
                    {
                            int numb=(int)(s.charAt(pos)-'0');
                            char generate=(char)('a'+numb-1);
                           sb.append(generate);
                           pos=pos-1;
                            System.out.println(numb);
                            
                    }
            }
            
            return sb.reverse().toString();
    }
}