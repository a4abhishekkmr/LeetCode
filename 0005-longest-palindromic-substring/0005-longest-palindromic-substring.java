class Solution {
    int maxlen=0,lo=0;
    public String longestPalindrome(String s) {
        //ok so i will start with every point and try to extend the length of the point from both the sides and then finally notice for the longest length of substring
        
        
        int n=s.length();
        if(n<2) return s;
        for(int i=0;i<n-1;i++)
        {
            //odd ke lie 1 point while even k lie 2 point
            extendPalindrome(s,i,i);
            extendPalindrome(s,i,i+1);
        }
        return s.substring(lo,lo+maxlen);
    }
    
    void extendPalindrome(String s,int start,int end)
    {
        
        while(start>=0 && end<s.length() && s.charAt(start)==s.charAt(end))
        {
            start--;end++;
        }
        if(maxlen<end-start-1)
        {
            lo=start+1;
            maxlen=end-start-1;
        }
    }
}
//Another easy Solution
//https://leetcode.com/problems/longest-palindromic-substring/discuss/2928/Very-simple-clean-java-solution