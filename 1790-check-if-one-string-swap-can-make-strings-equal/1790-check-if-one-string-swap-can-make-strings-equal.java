class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
       
        //let's count the difference between these strings(of chars) and now lets check those chars
        
        int diff=0;
        ArrayList<Character> al=new ArrayList<>();
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)!=s2.charAt(i))
            {diff++;
             al.add(s1.charAt(i));
             al.add(s2.charAt(i));
            }
            if(diff>2) return false;
            
        }
        if(diff==0) return true;
        if(diff!=2) return false;
        else
        {
            if(al.get(0)==al.get(3) && al.get(1)==al.get(2)) return true;
            else return false;
        }
    }
}