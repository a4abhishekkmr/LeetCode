class Solution {
    public String minWindow(String s, String t) {
        //first i will go with brute force
        
        int n=s.length();
        int find=t.length();
        if(find>n) return "";
        if(find==n &&s.equals(t))
           return s;
        
        HashMap<Character,Integer> hm=new HashMap<>();
        
        for(int i=0; i<find;i++)
            hm.put(t.charAt(i) ,hm.getOrDefault(t.charAt(i),0)+1);
        
        int count=hm.size();
        int start=0,end=0,min=Integer.MAX_VALUE;
        
        String ans="";
        
        while(end<n)
        {
            char ch=s.charAt(end);
            if(hm.containsKey(ch))
            {
                hm.put(ch,hm.get(ch)-1);
            
            if(hm.get(ch)==0) count--;
            }
            if(count>0) end++;
            else if(count==0)
            {
                while(count==0)
                {
                    if(end-start+1<min)
                    { min=end-start+1;
                    ans=s.substring(start,end+1);}
                
                char aagewala=s.charAt(start);
                if(hm.containsKey(aagewala))
                {
                    hm.put(aagewala,hm.get(aagewala)+1);
                    if(hm.get(aagewala)==1) count++;
                }
                start++;
            }
            end++;
            }
        }
        
        return ans;
    }
}