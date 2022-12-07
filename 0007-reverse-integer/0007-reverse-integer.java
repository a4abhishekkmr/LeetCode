class Solution {
    public int reverse(int x) {
        //since we have to deal with upto 2^32 means we can solve this within int. and for 2^64 we can use
        // if diving with 10 if not comes the same means garbage value collected and hence we can identify big no,
        long res=0;
        while(x!=0)
        {
            long temp= res*10 + x%10;
            System.out.println(temp+" "+res);
            //if(temp/10!=res)
                //return 0;
            res=temp;
            x=x/10;
        }
        //another way is to do like below
        if(res>Integer.MAX_VALUE || res<Integer.MIN_VALUE)return 0;
        return (int)res;
    }
}