class Solution {
    public int lengthOfLongestSubstring(String s) {
        //HashTable- Sliding window
        
        int max=0;
    //take HashMap and iterate and fill char with its index. if present then return its difference
        if(s.length()<=1) return s.length();
        
        
        HashSet<Character> hs=new HashSet();
        
        int j=0;
        int i=0;
        while(i<s.length())
        {
            char ch=s.charAt(i);
            
            if(!hs.contains(ch))
            {
                hs.add(ch);
                i++;
                if(max<hs.size()) max=hs.size();
            }
            else
            {
                hs.remove(s.charAt(j++));
            }
        }
        
        return max;
    }
}