class Solution {
    public boolean isIsomorphic(String s, String t) {
        //ok so what i will do is i will maintain a HashTable where all characters are mentioned as
        //key- char of s to be replaced value- char of t which will be formed.
        
        //or i can also optimize the space by making a 26 size char array.'
        //let's first solve by hashMap
        
        HashMap<Character,Character> hm=new HashMap<>();
        
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            char temp=t.charAt(i);
            
            if(hm.containsKey(ch))
            {
                char get=hm.get(ch);
                if(get!=temp) return false;
            }
            else if(hm.containsValue(temp)) {
                return false;
            }
            else
                hm.put(ch,temp);
        }
        return true;
    }
}