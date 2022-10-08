class Solution {
    public int[] minOperations(String boxes) {
        //ok i understood the problem
        //create an returning array of size bixes.length
        
        int n=boxes.length();
         int ans[]=new int[n];
        
//         for(int i=0;i<n;i++)
//         {
//             int x=0;
//             for(int j=0;j<n;j++)
//             {
//                 if(boxes.charAt(j)=='1')
//                     x+=Math.abs(i-j);
//             }
//             ans[i]=x;
//         }
//         return ans;
        
        //Another approach
        //calculating sum approach
        //taking example of "001011" where for first char i have 3 1's totaling 2+4+5=11
        //now for char at 2. i have to substract 3 as all 1's need less 1 times so total 3 place and result will be 11-3=8
        //similarly for next it will be 8-3=5
        //now at index = 3, i can see there are 2 balls that will take 5 operations for index 2 and there is 1 ball on the left which will need to traverse 1 step ahaed then total steps = 5 - 2 + 1 => 4
        
        int count=0,sum=0;
        
        for(int i=0;i<n;i++)
        {
            if(boxes.charAt(i)=='1')
            {count++;sum+=i;}
        }
        ans[0]=sum;
        
        int backcount=0;
        if(boxes.charAt(0)=='1')
            {count--;backcount++;}
        
        for(int i=1;i<n;i++)
        {
            ans[i]=ans[i-1]-count+backcount;
            if(boxes.charAt(i)=='1')
            {count--;backcount++;}
        }
        return ans;
    }
}