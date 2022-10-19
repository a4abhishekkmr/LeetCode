class Solution {
    public boolean repeatedSubstringPattern(String s) {
        
        //First find the Substring which has to be repeated
        
        //first iterate to half and then for every substring check that is it equals to copy of that n times which make it length equals to s.
        
        
        int n=s.length();
        if(n==1) return false;
        if(n==2 && s.charAt(0)==s.charAt(1)) return true;
        
        //String formed="";
        for(int i=0;i<n/2;i++)
        {StringBuffer sb=new StringBuffer();
            int times=n/(i+1);
            String get=s.substring(0,i+1);
            
            for(int j=0;j<times;j++)
                sb.append(get);
         //check time
         
         if(s.contentEquals(sb)) return true;
         //System.out.println(sb);
        }
        
        return false;
    }
}