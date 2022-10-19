class Solution {
    public int[] plusOne(int[] digits) {
        /* Problem :- 
        I am having a fixed sized array but what if my number is like 9999 then successor of this would ne 10000 which is of 1 extra length 
        
        solving this can be easy if we check weather our last(least significant bit) is 9 or not 
        if not then we can just directly increase it and return else i have to take arraylist and solve it
        
        so solution is */
        
        if(digits[digits.length-1]!=9)
        {
            digits[digits.length-1]++;
            return digits;
        }
        
        
        //else
        int carry=1;
        for(int i=digits.length-1;i>=0;i--)
        {
            int d=digits[i]+carry;
            if(d>9)
            {
                digits[i]=d%10;
                carry=d/10;
                continue;

            }
            digits[i]=d;
            carry=0;
        }
        if(carry==0) return digits;
        
        //size++;
        
        int ans[]=new int[digits.length+1];
        for(int i=1;i<ans.length;i++)
        {
            ans[i]=digits[i-1];}
        ans[0]=1;
        
        return ans;
        
        
    }
}