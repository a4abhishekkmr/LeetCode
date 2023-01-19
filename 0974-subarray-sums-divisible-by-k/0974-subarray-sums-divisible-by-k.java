class Solution {
    public int subarraysDivByK(int[] nums, int k) {
 /*       
example: 4 5 0 -2 -3 1  && k=5;

initially sum=0;
for i=0 sum+=4;(sum=4)  sum%k=4                    [(0,1),(4,1),]
for i=1 sum+=5;(sum=9)  sum%k=4                    [(0,1),(4,2)] =1
        remainder repeats itself means, subarray is found
for i=2 sum+=0;(sum=9) sum%k=4                     [(0,1),(4,3)]= 1+2
        again remainder repeated.
for i=3 sum+=(-2);(sum=7) sum%k=2                  [(0,1),(4,3),(2,1)]
for i=4 sum+=(-13);(sum=-6) sum%k=-2 +5=3          [(0,1),(4,4),(2,1)] = 1+2+3
        again remainder repeated.
for i=5 sum+=1;(sum=5)    sum%k=0                  [(0,2),(4,4),(2,1)] = 1+2+3+1=7
        again repeated.
        
        */
        
        int n=nums.length;
        Map<Integer,Integer> hm=new HashMap<>();
        
        hm.put(0,1);
        int sum=0,res=0;
        for(int i=0;i<n;i++)
        {
            sum+=nums[i];
            int rem=((sum)%k +k)%k;
            
            if(hm.containsKey(rem))
                res+=hm.get(rem);
            
            hm.put(rem,hm.getOrDefault(rem,0)+1);
        }
        return res;
    }
}