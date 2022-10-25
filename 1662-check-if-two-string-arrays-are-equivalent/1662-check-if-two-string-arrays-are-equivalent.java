class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        
        //2 solutions will be there either to build 2 strings and then make comparision of both formed ones
        //or 2nd approach will be to iterate over char by char and then check if not same return false;
        StringBuilder sb=new StringBuilder();
        StringBuilder sf=new StringBuilder();
        
        for(int i=0;i<word1.length;i++)
            sb.append(word1[i]);
        
        for(int i=0;i<word2.length;i++)
            sf.append(word2[i]);
        
        return sb.toString().equals(sf.toString());
        
    }
}