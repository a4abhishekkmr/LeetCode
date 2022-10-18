class Solution {
    public int strStr(String given, String find) {
        //return haystack.indexOf(needle);
        
        
        //Another Method
        
        int n=given.length();
        int m=find.length();
        for(int i=0;i<=(n-m);i++)
        {
            if(given.charAt(i)==find.charAt(0))
            {
                for(int ii=0;ii<find.length();ii++)
                {
                    if(given.charAt(i+ii)!=find.charAt(ii))
                        break;
                    if(ii==(m-1))
                        return i;
                }
            }
        }
        return -1;
    }
}