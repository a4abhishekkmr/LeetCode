class Solution {
    public int longestPalindrome(String s) {
        
        HashMap<Character,Integer> map=new HashMap<>();
        
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(!map.containsKey(ch))
                map.put(ch,1);
            else
                map.put(ch,map.get(ch)+1);
        }
        int len=0;
        for(int i:map.values())
        {
            if(i%2==0) len+=i;
            else len+=i-1;
        }
        //final check for middle by checking single char present 
        
        return len<s.length()?len+1:len;
    }
}

//Master Solution is here
//https://leetcode.com/problems/longest-palindrome/discuss/2714192/JAVA-or-3-Approaches-or-Everything-you'd-need