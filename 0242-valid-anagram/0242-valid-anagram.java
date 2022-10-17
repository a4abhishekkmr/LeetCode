class Solution {
    public boolean isAnagram(String s, String t) {
        //i will make a counter of all the chars such that how many times a char present in the string s and then will compare it with string t.
        
        int count[]=new int[26];
        for(int i=0;i<s.length();i++)
            count[(int)s.charAt(i)-'a']++;
        
        for(int i=0;i<t.length();i++)
            count[(int)t.charAt(i)-'a']--;
        
        for(int i=0;i<26;i++)
            if(count[i]!=0) return false;
        
        return true;
    }
}