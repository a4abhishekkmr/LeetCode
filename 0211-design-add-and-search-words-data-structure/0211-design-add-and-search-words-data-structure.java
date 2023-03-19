class WordDictionary {

    HashSet<String> dict;
    boolean singleChar=false;
    public WordDictionary() {
       dict=new HashSet();
    }
    
    public void addWord(String word) {
        if(word.length()==1){singleChar = true;}
        dict.add(word);
    }
    
    public boolean search(String word) {
        if(word.contains("."))
        {
            if(word.equals(".")) // edge case that slows us down
            {return singleChar;}
            char[] arr = word.toCharArray();
            for(String i : dict) // cluster fuck of code to test if the given string matches our parameter
            {
                if(i.length() == arr.length)
                {
                    StringBuilder curr = new StringBuilder();
                    for(int j = 0; j < arr.length; j++)
                    {
                        if(arr[j]=='.')
                        {
                            curr.append('.');
                        }
                        else
                        {
                            curr.append(i.charAt(j));
                        }
                    }
                    if(curr.toString().equals(word))
                    {
                        return true;
                    }
                }
                
            }
        }
        return dict.contains(word);
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */