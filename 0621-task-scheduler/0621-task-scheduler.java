class Solution {
    public int leastInterval(char[] tasks, int n) {
        if(n==0) return tasks.length;
        
        //got it in greedy approach
        
        //take the 3rd example 
        //make freq array and then sort it and the most freq element will be in last which will
        //create the max no of slots available now fill the slots
        
        //taking ex 3;- freq array will be like, 6,1,1,1,1,1,1,0,0,0...... and so on
        //after sorting ......1,1,6 and this siz with n=2 will create 12 slots in between so we need to fill those slots only
        
        //max=6-1=5 so slots availablle=10;
        
        int freq[]=new int[26];
        
        for(char ch:tasks)
            freq[ch-'A']++;//only upper case
        
        Arrays.sort(freq);
        
        int max=freq[25]-1;
        int slots=max*n;//max slots now available after putting the last most freq element
        
        for(int i=0;i<25;i++)
            slots-=Math.min(freq[i], max);
        
        return slots>0?slots+tasks.length:tasks.length;
    }
}