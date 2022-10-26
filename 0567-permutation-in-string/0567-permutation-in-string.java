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
            //remove i and add i+len-1  dur to 0 based index i have to add 2th index for (1)+2-1;//badh gya hai i 1 se
            window[s2.charAt(i++)-'a']--;
            window[s2.charAt(i+n-1)-'a']++;
            //check
            if(Arrays.equals(freq,window)) return true;
        }
        
        return false;
    }
}

/* ANother GOod Solution

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] arr = new int[26];
        for(char c : s1.toCharArray()) arr[c - 'a']++;
        int j = 0, i = 0;
        int count= s1.length();
        while(j < s2.length()){
            if(arr[s2.charAt(j++) - 'a']-- > 0)
                count--;
            if(count == 0) return true;
            if(j - i == s1.length() && arr[s2.charAt(i++) - 'a']++ >= 0)
                count++;
        }
        return false;
    }
}
*/