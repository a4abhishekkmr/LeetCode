class Solution {
    public int[] findArray(int[] pref) {
        int ans[]=new int[pref.length];
        
        for(int i=pref.length-1;i>=1;i--)
        {
            pref[i]=pref[i]^pref[i-1];
        }
        return pref;
    }
}