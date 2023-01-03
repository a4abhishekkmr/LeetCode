class Solution {
    public boolean detectCapitalUse(String word) {
        
        //we will move by checking thr first and second char if same then use match else updown
        int n=word.length();
        if (n==1) return true;
        int ch1=word.charAt(0);
        int ch2=word.charAt(1);
        
        if(((ch1<='Z' && ch1>='A')&&(ch2<='Z' && ch2>='A'))||((ch1<='z' && ch1>='a')&&(ch2<='z' && ch2>='a')))
            return match(word,n);
        
        else
            return updown(word,n);
    }
    private boolean match(String word,int n)
    {
        boolean up=false;
        char ch=word.charAt(0);
        if(ch<='Z' && ch>='A')
            up=true;
        
        for(int i=2;i<n;i++)
        {
            char curr=word.charAt(i);
            if(up && (curr>='a' && curr<='z'))
                return false;
            else if(up==false && (curr>='A' && curr<='Z'))
                    return false;
        }
        return true;
    }
    private boolean updown(String word,int n)
    {
        
        for(int i=1;i<n;i++)
        {
            char curr=word.charAt(i);
            if((curr>='A' && curr<='Z'))
                return false;
        }
        return true;
    }
}