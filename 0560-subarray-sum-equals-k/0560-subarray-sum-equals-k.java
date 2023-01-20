class Solution {
    public int subarraySum(int[] nums, int k) {
        //code:-
        
        HashMap<Integer,Integer> hs=new HashMap<>();
        int res=0;
        int sum=0;
        hs.put(0,1);
        
        for(int x:nums)
        {
            
            sum+=x;
            
            if(hs.containsKey(sum-k))
            {
                res+=hs.get(sum-k);
            }
            hs.put(sum,hs.getOrDefault(sum,0)+1);
        }
        System.out.print(hs);
        return res;
    }
}