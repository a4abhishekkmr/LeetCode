class Solution {
    public String addStrings(String num1, String num2) {
        //ok so i will do this by taking from the last end of both the strings.
        
        int l1=num1.length()-1,l2=num2.length()-1;//getting the last positions
        
        int carry=0;
        StringBuilder sb=new StringBuilder();
        
        while(l1>=0 && l2>=0)
        {
            int a=num1.charAt(l1)-'0';
            int b=num2.charAt(l2)-'0';
            
            int total=a+b+carry;
            int val=total%10;
            carry=total/10;
            sb.append(Integer.toString(val));
            l1--;l2--;
        }
        while(l1>=0)
        {
            int a=num1.charAt(l1)-'0';

            int total=a+carry;
            int val=total%10;
            carry=total/10;
            sb.append(Integer.toString(val));
            l1--;
        }
        while(l2>=0)
        {
            int a=num2.charAt(l2)-'0';

            int total=a+carry;
            int val=total%10;
            carry=total/10;
            sb.append(Integer.toString(val));
            l2--;
        }
        if(carry>0)
            sb.append(Integer.toString(carry));
        return sb.reverse().toString();
    }
}