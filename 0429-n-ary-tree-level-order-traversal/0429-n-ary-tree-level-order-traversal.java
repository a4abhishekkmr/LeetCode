/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        
        List<List<Integer>> ans=new ArrayList<>();
        
        Queue<Node> q=new LinkedList<>();
        
        if(root==null) return ans;
        q.add(root);
        
        while(!q.isEmpty())
        {
            int rowLen=q.size();
            List<Integer> currRow=new ArrayList<>();
            
            for(int i=0;i<rowLen;i++)
            {
                Node curr=q.poll();
                currRow.add(curr.val);
                
                int lenChild=curr.children.size();
                for(int j=0;j<lenChild;j++)
                {
                    if(curr.children.get(j)!=null)
                        q.add(curr.children.get(j));
                }
            }
            ans.add(currRow);
        }
        return ans;
    }
}


/* Another Good Solution via Recusrion
class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        solve(root, 0, res);
        return res;
    }
    
    private void solve(Node root, int level, List<List<Integer>> res){
        if(root == null) return;
        
        // When found a new level, add a new list
        if(level >= res.size())
            res.add(new ArrayList<>());
        
        // Add node in the list at the related level
        res.get(level).add(root.val);
        
        // Traverse all the children
        for(Node n : root.children)
            solve(n, level+1, res);
    }
}
*/