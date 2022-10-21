class Solution {
    public String multiply(String num1, String num2) {
        
        //since length can be upto 200 so cant take it as string to int and multiply. but we can make a array or say arrays to store products
        /* for example 123*12 i will make 2 arrays of both num1 and num2
        then make products into array=>[1,2,3] and [2,4,6,0] and the final sum will be [2,5,8,3] which will be after adding makes the answer "2583";
        
        */
        
        int n1=num1.length();
        int n2=num2.length();
        if((n1==1 &&Integer.valueOf(num1)==0) || (n2==1 && Integer.valueOf(num2)==0))
            return "0";
        if(n1>n2)
            return jaishreeram(num1,num2,n1,n2);
        
        else
            return jaishreeram(num2,num1,n2,n1);

    }
    
    private String jaishreeram(String big,String small,int b,int s)
    {
        //i will make 2d arraylist and put the products there
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        
        int times0=0;
        for(int i=s-1;i>=0;i--)
        {
            ArrayList<Integer> al=new ArrayList();
            for(int ii=0;ii<times0;ii++)
            {
                al.add(0);
            }
            int mul=(int)small.charAt(i)-'0';
            int carry=0;
            for(int j=b-1;j>=0;j--)
            {
                int val=(int)big.charAt(j)-'0';
                int pro=val*mul+carry;
                carry=pro/10;
                al.add(pro%10);
            }
            if(carry>=1) al.add(carry);
            ans.add(al);
            times0++;
        }
        
        ArrayList<Integer> sum=new ArrayList<>();
        
        //print
//         for(int i=0;i<s;i++)
//         {
//             ArrayList<Integer> print=ans.get(i);
//             for(int ii=0;ii<print.size();ii++)
//                System.out.print(ans.get(i).get(ii)+" ");
            
//             System.out.println();
//         }
        
        
        int carry=0;
        
        int maxlen=ans.get(ans.size()-1).size();
        for(int i=0;i<maxlen;i++)
        {
            int total=0;
            for(int j=0;j<s;j++)
            {
                if(ans.get(j).size()>i)
                   total+=ans.get(j).get(i); 
            }
            total+=carry;
            sum.add(total%10);
            carry=total/10;
        }
        if(carry>=1) sum.add(carry);
        
        // for(int i=0;i<sum.size();i++)
        //     System.out.print(sum.get(i)+" ");
        
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<sum.size();i++)
            sb.append(sum.get(i));
        return sb.reverse().toString();
    }
}




