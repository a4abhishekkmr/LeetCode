class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        //2nd time i am solvng this becoz first logic is not the optimal solution
        
        // i will take a HashMap and then put them with count as value.
        //then while fetching the data in nums2 will find the number present then add it in answer and decrease the count in hm'
        
        ArrayList<Integer> al=new ArrayList<>();
        //to store data uncountable numbers
        
        HashMap<Integer,Integer> hm=new HashMap<>();
        
        for(int x:nums1)
        {
            if(hm.containsKey(x))
                hm.put(x,hm.get(x)+1);
            else
                hm.put(x,1);
        }
        
        //now fetch data
        for(int y:nums2)
        {
            if(hm.containsKey(y))
            {
                al.add(y);
                if(hm.get(y)==1)
                    hm.remove(y);
                else
                    hm.put(y,hm.get(y)-1);
            }
        }
        
        int ans[]=new int[al.size()];
        for(int i=0;i<al.size();i++)
            ans[i]=al.get(i);
        
        return ans;
    }
}