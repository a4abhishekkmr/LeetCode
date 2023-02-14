class Solution {
    public int countOdds(int low, int high) {
        
        
        int diff=high-low;
        int odd=0;
        if(low%2==1) odd++;
        else if(high%2==1) odd++;
        
        odd+=(diff)/2;
        
        return odd;
    }
}