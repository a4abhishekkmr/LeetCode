class Solution {
    public int compress(char[] chars) {
        int i=0,res=0;
        
        while(i<chars.length)
        {
            int grouplength=1;
            while(i+grouplength<chars.length && chars[i+grouplength]==chars[i])
            {
                grouplength++;
            }
            chars[res++]=chars[i];
            if(grouplength>1)
            {
                for(char c:Integer.toString(grouplength).toCharArray())
                    chars[res++]=c;
            }
            i+=grouplength;
        }
        return res;
    }
}