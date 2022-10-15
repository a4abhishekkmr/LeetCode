class Solution {
    public List<String> subdomainVisits(String[] domains) {
        
        //use hashmap to store
        
        HashMap <String,Integer> hm=new HashMap<>();
        
        for(int i=0;i<domains.length;i++)
        {
            String str=domains[i];
            
            //first we will catch by space and end
            //then next . and end;
            
            String[] val=str.split(" ");
            // String[] dom=val[1].split(".");
            
            int times=Integer.valueOf(val[0]);
            
            if (hm.containsKey(val[1])) {
                hm.put(val[1], hm.get(val[1]) + times);
            } else {
                hm.put(val[1], times);
            }
            
            int lastIndexOfDot = val[1].lastIndexOf('.');
            int currIndexOfDot = val[1].indexOf('.');
            
            while (currIndexOfDot != lastIndexOfDot) {
                String s1 = val[1].substring(currIndexOfDot + 1);
                if (hm.containsKey(s1)) {
                    hm.put(s1, hm.get(s1) + times);
                } else {
                    hm.put(s1, times);
                }
                    //iterate
                val[1] = val[1].replaceFirst("\\.", "-");//. to something
                currIndexOfDot = val[1].indexOf('.');
            }
            //last one
            String s1 = val[1].substring(lastIndexOfDot + 1);
            if (hm.containsKey(s1)) {
                hm.put(s1, hm.get(s1) + times);
            } else {
                hm.put(s1, times);
            }
        }
        ArrayList<String> answer=new ArrayList<>();
        
        for(Map.Entry<String,Integer> e:hm.entrySet())
        {
            String ans="";
            ans+=e.getValue();
            ans+=" ";
            ans+=e.getKey();
            answer.add(ans);
        }
        return answer;
    }
}

//hm.put(arr1[i],hm.getOrDefault(arr1[i],0)+1);