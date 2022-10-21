/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int lo=1,high=n;
        
        while(lo<=high)
        {
            int mid=lo+(high-lo)/2;
            if(isBadVersion(mid)==false) //mtlb abhi v bad version ni hai or aage jao
                lo=mid+1;
            else
                high=mid-1;//iska mtlb bad hai to or peeche jao first point dhundne ko
        }
        return lo;
    }
}