class Solution {
    public String frequencySort(String s) {
        //ok so make the count table of 'A' and 'z' which is 65 to 122
        //and then we can iterate over the array to find the maximum and print the frequency.
        //this will take more time but lets start
        
        int []count=new int[256];
        
        for(int i=0;i<s.length();i++)
        {
            count[s.charAt(i)]++;
        }
        
        StringBuilder sb=new StringBuilder();
        int max=-1;
        while(max!=0)
        {
            max=-1;
            int maxpos=0;
            for(int i=0;i<256;i++)
            {
                if(count[i]>max)
                {
                    max=count[i];
                    maxpos=i;
                }
            }
            for(int j=0;j<max;j++)
            {
                sb.append((char)maxpos);
            }
            count[maxpos]=0;
        }

        return sb.toString();
    }
}


//without Priority Queue
//https://leetcode.com/problems/sort-characters-by-frequency/discuss/2818049/Java-O(n)-Easiest-Solution
