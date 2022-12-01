class Solution {
    public boolean halvesAreAlike(String s) {
        //break the array into two half and then count the vowels present in both the Strings
            
            int n=s.length();
            String a=s.substring(0,n/2);
            String b=s.substring(n/2);
            
            return count(a)==count(b)?true:false;
    }
        
        int count(String s)
        {
                int vowel=0;
                
                for(int i=0;i<s.length();i++)
                {
                        if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
                                vowel++;
                }
                
                return vowel;
        }
}