class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        //ok the idea coming to me is I will take the String element and make it to char array then sort it and then check with the help of HahsMap
        
        List<List<String>> ans=new ArrayList<>();
        
        HashMap<String,ArrayList<String>> hm=new HashMap<>();
        
        for(int i=0;i<strs.length;i++)
        {
            String curr=strs[i];
            char []arr=curr.toCharArray();
            Arrays.sort(arr);
            
            String formed=new String(arr);
            if(hm.containsKey(formed))
                hm.get(formed).add(curr);
            
            else
            {
                hm.put(formed,new ArrayList<>());
                hm.get(formed).add(curr);
            }
        }
        for (List<String> item: hm.values()) {
    	ans.add(item);
        }
        return ans;
    }
}
// Time Complexity: O(n * klog(k)) since we are sorting k characters n times in the loop.
//     return new ArrayList<>(mpp.values());