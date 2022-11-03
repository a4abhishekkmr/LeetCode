public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        /*idea 
    1) first we will check from last index that from 0th index weather i.e 1 or zero .. suppose
    2) 00000.....101  -->> as last bit is one 
    3) so we will run this loop from 0 to 31 ; 
    4) than we will swap that last bit at first and than 2nd last bit at 2 position by doing 1<<(31-i);
        */
        
        int res=0;
        for(int i=0;i<32;i++)
        {
            res=res<<1;//ek kadam aage
            if((n&1)==1)
            {
                res=res|1;
            }
            n=n>>1;
        }
        return res;
        
    }
}