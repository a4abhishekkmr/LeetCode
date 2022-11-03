class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1) return true;
        if (n<=0) 
            return false;
        //Since the question says.
        //Follow up: Could you solve it without loops/recursion?
            //so i have to do without it. else one option is to divide or>> while>1 and get number of 1's by & op.
        //One of the best soln is this below
            //return Integer.bitCount(n)==1?true:false;
            if((n&(n-1))==0)
                return true;
            return false;
    }
}
   /* 
    Another OSlution
        
    if(n<=0 ) return false;
    int count =0;
    for(int i=0;i<32;i++){
        if((n&1)!=0) count++ ; 
        if(count>1)  return false;
        n=n>>1;
    }
    return true;  
    
    
//method -2 (O(1))

    return (n>0) && (n & n-1)==0;
}
*/
