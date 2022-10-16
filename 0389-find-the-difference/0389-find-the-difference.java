class Solution {
    public char findTheDifference(String s, String t) {
        //put all letters of t in count array and then substract the letters of c to find that lucky char
        
        int count[]=new int[26];
        for(int i=0;i<t.length();i++)
        {
            count[t.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++)
        {
            count[s.charAt(i)-'a']--;
        }
        
        for(int i=0;i<26;i++)
            if(count[i]>0) return (char)('a'+i);
        
        return 'a';
    }
}