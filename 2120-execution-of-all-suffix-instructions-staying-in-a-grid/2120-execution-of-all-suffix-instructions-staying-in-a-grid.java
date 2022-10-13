class Solution {
    public int[] executeInstructions(int n, int[] startPos, String s) {
        //ok so make a grid and always pass for the i the for string
        
        int ans[]=new int[s.length()];
        
        for(int i=0;i<s.length();i++)
        {
            ans[i]=helper(n,startPos,s,i);
        }
        
        return ans;
    }
    
    
    private int helper(int n,int[] start,String s,int pos)
    {
        int x=start[0],y=start[1];
        
        int maxend=n-1;
        int count=0;
        for(int i=pos;i<s.length();i++)
        {
            if(s.charAt(i)=='U')
            {
                if(x>0)
                {
                    x--;
                    count++;
                }
                else break;
            }
            else if(s.charAt(i)=='L')
            {
                if(y>0)
                {
                    y--;
                    count++;
                }else break;
            }
            else if(s.charAt(i)=='D')
            {
                if(x<maxend)
                {
                    x++;
                    count++;
                }else break;
            }
            else if(s.charAt(i)=='R')
            {
                if(y<maxend)
                {
                    y++;
                    count++;
                }else break;
                //
            }
        }
        return count;
    }
}