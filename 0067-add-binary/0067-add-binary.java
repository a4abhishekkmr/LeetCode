class Solution {
    public String addBinary(String a, String b) {
        //cant take it as Integer.value of then sum and then binary .. we have to use Or product of this along with if 1 +1 =1 and 1 as carry
        
        //now Start form end
        
        StringBuilder sb=new StringBuilder();
        
        int x=a.length(),y=b.length();
        
        int carry=0;
        
        
        while(x>0 && y>0)
        {
            int temp=a.charAt(--x)-'0'+b.charAt(--y)-'0'+carry;
            sb.append(temp%2);
            carry=temp/2;
        }
        while(x>0)
        {
            int temp=a.charAt(--x)-'0'+carry;
            sb.append(temp%2);
            carry=temp/2;
        }
        while(y>0)
        {
            int temp=b.charAt(--y)-'0'+carry;
            sb.append(temp%2);
            carry=temp/2;
        }
        while(carry>0)
        {
            sb.append(carry%2);
            carry=carry/2;
        }
        return sb.reverse().toString();
    }
}