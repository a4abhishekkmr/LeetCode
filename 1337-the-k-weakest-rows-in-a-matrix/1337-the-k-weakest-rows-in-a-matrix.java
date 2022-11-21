class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        //so we have to Take Hashmap that will store position of size n rows and store all soldiers count of each row
            
            HashMap<Integer,Integer> hm=new HashMap<>();
            int count=0;
            for(int i=0;i<mat.length;i++)
            {
                    
                while(count<mat[i].length && mat[i][count]>0)
                        count++;
                    
                    hm.put(i,count);
                    count=0;
            }
            
            List<Map.Entry<Integer,Integer>> al=new LinkedList<>(hm.entrySet());
            
            al.sort(Map.Entry.comparingByValue());
            
            int ans[]=new int[k];
            int t=0;
            for(Map.Entry<Integer,Integer> map:al)
            {
                ans[t++]=map.getKey();
                    
                    if(t==k) break;
            }
            
            return ans;
    }
}