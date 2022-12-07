class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        //ok i got the point.
        //take a char of size 26 and check for all its absence. if yes then mark it as ans and put the pos.
        
        int n=s.length();
        int m=p.length();
        List<Integer> ans=new ArrayList<>();
        
        if(n<m) return ans;
        
        int freq[]=new int[26];
        
        //first feed the p in freq.
        for(int i=0;i<m;i++)
        {
            freq[p.charAt(i)-'a']++;
        }
        //now check for first m chars in s;
        
        for(int i=0;i<m;i++)
        {
            freq[s.charAt(i)-'a']--;
        }
        if(zerochecker(freq)) ans.add(0);
        
        //now use two pointer from here.
        
        int j=1;
        while(j<n-m+1)
        {
            freq[s.charAt(j-1)-'a']++;
            freq[s.charAt(m+j-1)-'a']--;
            if(zerochecker(freq)) ans.add(j);
            j++;
        }
        return ans;
    }
    
    private boolean zerochecker(int []arr)
    {
        for(int i=0;i<26;i++)
            if(arr[i]>0) return false;
        return true;
    }
}