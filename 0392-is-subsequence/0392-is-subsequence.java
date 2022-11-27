class Solution {
    public boolean isSubsequence(String s, String t) {
        
        int j=0;
        int n=t.length();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            
            while(j<n && ch!=t.charAt(j))
            {
                //System.out.println(i+" "+j);
                j++;
            }
            if(j>=n) return false;
            j++;
        }
        return true;
    }
}