class Solution {
    
        
        //lets make the order given as refernce by taking it into hashmap and will put the char as key and its value by order of the position like for first pos the value is 0;
        
            Map<Character , Character> map = new HashMap<>();
    public boolean isAlienSorted(String[] words, String order) {        
        char d = 'a';
        for(char c : order.toCharArray()){
            map.put(c,d);
            d++;
        }
        String arr[] = new String[words.length];
        int i=0;
        for(String w:words){
            arr[i++] = change(w);
        } 
        words = arr.clone();        
        Arrays.sort(arr);
        for(int j=0;j<words.length;j++){
            if(!arr[j].equals(words[j]))
                return false;
        }
        return true;
    }
        public String change(String w){
        String str ="";
        for(char c: w.toCharArray())
            str+=map.get(c);
        return str;
    }
}