class Solution {
    public boolean backspaceCompare(String s, String t) {
        
        //i will deal with StringBuilder instead of String just for less time comp.
        StringBuilder sbi=new StringBuilder();
        StringBuilder boi=new StringBuilder();
        
        check(s,sbi);
        check(t,boi);
        
        return sbi.toString().equals(boi.toString());
    }
    
    private void check(String s,StringBuilder sb)
    {
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            if(ch=='#' && sb.length()>0)
                sb.deleteCharAt(sb.length()-1);//sb.setLength(sb.)
            else if(ch>='a' && ch<='z')
                sb.append(ch);
            else
                continue;
        }
    }
}

