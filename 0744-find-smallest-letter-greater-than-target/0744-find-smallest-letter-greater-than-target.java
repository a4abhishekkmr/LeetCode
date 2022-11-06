class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        
        int lo=0,hi=letters.length-1;
        int ans=0;
        while(lo<=hi)
        {
            int mid=lo+(hi-lo)/2;
            
            if(letters[mid]-target>0)
            {
                hi=mid-1;
                ans=mid;
            }
            else if(letters[mid]-target<=0) lo=mid+1;
            //else return ans;
        }
        return letters[ans];
    }
}

