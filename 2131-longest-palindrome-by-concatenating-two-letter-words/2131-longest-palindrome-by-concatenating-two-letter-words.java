class Solution {
    public int longestPalindrome(String[] words) {
        //ok so what i will do is i will first put all words in the HashSet and then
        // check for curr string
        //2 cases will arise either that string is palindrome or not palindrome
        //if palindrome means this can be settled in the middle but only once next time i want the pairs of the palindromic strings
        
        int length=0;
        int count=0;
        
        HashMap<String,Integer> hm=new HashMap<>();
        
        
        for(int i=0;i<words.length;i++)
        {
            String curr=words[i];
            char a=curr.charAt(1);
            char b=curr.charAt(0);
            StringBuilder sb=new StringBuilder();
            sb.append(a);sb.append(b);//s.charAt(1)+""+s.charAt(0);
            String formed=sb.toString();
            System.out.println(formed);
            if(curr.equals(formed))
            {
                if(hm.containsKey(formed))
                {
                length+=4;
                hm.remove(formed);
                    count--;
                }
                else
                {
                    count++;
                    hm.put(formed,1);
                }
            }
            else
            {
                int v=hm.getOrDefault(formed,0);
            if(v==0){
                int k=hm.getOrDefault(words[i],0);
                k++;
                hm.put(words[i],k);
            }
            else{
                v--;
                length+=4;
                // System.out.println(i);
                if(v==0){
                    hm.remove(formed);
                }
                else{
                    hm.put(formed,v);
                }
            }
            }
        }
        
        return (count>0)?length+=2:length;
    }
}