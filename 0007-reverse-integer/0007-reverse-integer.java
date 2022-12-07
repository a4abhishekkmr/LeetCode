class Solution {
    public int reverse(int x) {
        //since we have to deal with upto 2^32 means we can solve this within int. and for 2^64 we can use
        // if diving with 10 if not comes the same means garbage value collected and hence we can identify big no,
        int res=0;
        while(x!=0)
        {
            int temp= res*10 + x%10;
            System.out.println(temp+" "+res);
            if(temp/10!=res)
                return 0;
            res=temp;
            x=x/10;
        }
        
        return res;
    }
}