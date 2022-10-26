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