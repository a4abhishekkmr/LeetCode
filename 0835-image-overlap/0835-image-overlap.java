class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        
        ArrayList<Integer> al=new ArrayList<>();
        ArrayList<Integer> bl=new ArrayList<>();
        HashMap<Integer,Integer> hm=new HashMap<>();
        
        int N=img1.length;
        for(int i=0;i<N*N;i++)
        {
            if(img1[i/N][i%N]==1)
                al.add(i/N*100 + i%N);
        }
        for(int i=0;i<N*N;i++)
        {
            if(img2[i/N][i%N]==1)
                bl.add(i/N*100 + i%N);
        }
        for(int i:al)
        {
            for(int j:bl)
            {
                hm.put(i-j,hm.getOrDefault(i-j,0)+1);
            }
        }
        int count=0;
        for(int x:hm.values())
        {
            if(x>count)
                count=x;
                
        }
        return count;
    }
}