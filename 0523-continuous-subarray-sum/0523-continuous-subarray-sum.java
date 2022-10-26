class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        // 2 apointer approach with  adding next element in frame and remvoing the previous one
        //but will be more complex and costly
        //so move to another solution where i will be iterating over the nums and then making sum of its i and make a modulo of it
        //if modulo of that contains in hashmap means the number is found as sum of last continues in between sum's modulo is also coming same
        //first i will write the code and then will have the dry run
        
        int sum=0;
        
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0,-1);
        //this is for the sum of all n nums then we want length and it will give from -1 as index
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            sum=sum%k;//main khela
            
            if(hm.containsKey(sum))
            {
                if(i-hm.get(sum)>=2) return true;
            }
            else
                hm.put(sum,i);
        }
        return false;
    }
}
//taking example of this
/*
[23,2,4,6,7]
6

now we have 0,-1 in Hashmap

for i=0; sum=23 then sum=23%6=5;
now hm not contains so hm=((0,-1),(5,0));

for i=1; sum=5+2=7 sum=7%6=1  now again hm not contains so finally hm=((0,-1),(5,0),(1,0));

for i=2; sum=1+4=5 sum=5%6=5; but this time hm contains 5 and we can also see 2 and 4 makes sum=6
    so it contains and hm.get(5)==0 and i-0=> 2-0 which is >=2 so we will retur true;

hope this is clear.
*/