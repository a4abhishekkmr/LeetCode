class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        //HashTable and 2 pointers
        // i will make an array of size 26 and will store elements if of same bracket
        
        int n=s1.length();
        int len=s2.length();
        if(n>len) return false;
        //for(int )
        
        int freq[]=new int[26];
        int window[]=new int[26];
        //input all from s1 and also put in window of len s1 from s2
        for(int i=0;i<n;i++)
        {
            freq[s1.charAt(i)-'a']++;
            window[s2.charAt(i)-'a']++;
        }
            
        //check now
        if(Arrays.equals(freq,window)) return true;
        //now main loop starts
        
        int i=0;
        while(i<len-n)
        {
            //remove i and add i+len-1  dur to 0 based index i have to add 2th index for 0+2-1;
            window[s2.charAt(i++)-'a']--;
            window[s2.charAt(i+n-1)-'a']++;
            //check
            if(Arrays.equals(freq,window)) return true;
        }
        
        return false;
    }
}