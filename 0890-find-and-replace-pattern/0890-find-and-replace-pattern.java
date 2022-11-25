class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        
            
            //Given words[i].length == pattern.length
            
            ArrayList<String> ans=new ArrayList<>();
        //I need a function that will takes Words[i] and the pattern and returns true of pattern matches so that it will be added to ans.
        
        for(int i=0; i<words.length;i++)
        {
            if(patternmatched(words[i],pattern))
                ans.add(words[i]);
        }  
        return ans;
    }
    
    private boolean patternmatched(String a,String b)
    {
        if(b.length()==1) return true;
         for(int i =0; i<a.length(); i++){
            if(a.indexOf(a.charAt(i)) != b.indexOf(b.charAt(i))){
                return false;
            }
        }
        return true;
    }
}