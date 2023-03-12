class Node {
    boolean isEnd;
    Map<Character, Node> map = new HashMap<>();
}

class Trie {
    private Node root;
    
    public Trie() {
        root=new Node();
    }
    
    public void insert(String word) {
        Node temp = root;
        for (int ch=0;ch<word.length();ch++) {
            if (temp.map.containsKey(word.charAt(ch))) {
                temp = temp.map.get(word.charAt(ch));
            } else {
                Node nn = new Node();
                temp.map.put(word.charAt(ch), nn);
                temp = nn;
            }
            
        }
        temp.isEnd = true;
    }
    
    public boolean search(String word) {
        Node temp = root;
        for (int ch=0;ch<word.length();ch++) {
            if (!temp.map.containsKey(word.charAt(ch))) {
                return false;
            }
            temp = temp.map.get(word.charAt(ch));
           
        }
        return temp.isEnd;
    }
    
    public boolean startsWith(String prefix) {
         Node temp = root;
        for (int ch=0;ch<prefix.length();ch++) {
            if (!temp.map.containsKey(prefix.charAt(ch))) {
                return false;
            }
            temp = temp.map.get(prefix.charAt(ch));
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */