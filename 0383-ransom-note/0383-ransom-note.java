class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        //first i will store the occurences of magazine
        int count[] =new int[26];
        for(int i=0;i<magazine.length();i++)
        {
            count[magazine.charAt(i)-'a']++;
        }
        for(int i=0;i<ransomNote.length();i++)
        {
            if(count[ransomNote.charAt(i)-'a']==0) return false;
            count[ransomNote.charAt(i)-'a']--;
        }
        return true;
    }
}