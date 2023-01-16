class Solution {
    public String longestCommonPrefix(String[] strs) {
        //since length and word length all are of length 200 so i am going with 
        //nested for loop so tc- o(n^2)
        
        for(int i=0;i<strs[0].length();i++)
        {
            char ch=strs[0].charAt(i);
            for(int j=1;j<strs.length;j++)
            {
                if(strs[j].length()==i || strs[j].charAt(i)!=ch) return strs[0].substring(0,i);
                
            }
        }
        return strs[0];
    }
}