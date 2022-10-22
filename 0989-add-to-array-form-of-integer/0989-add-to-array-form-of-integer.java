class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        
        int carry=0;
        List<Integer> al=new ArrayList<>();
        
        int n=num.length;
        while(k>0 && n>0)
        {
            int add=k%10;
            add+=num[--n];
            
            k=k/10;
            add+=carry;
            al.add(add%10);
            carry=add/10;
        }
        while(n>0)
        {
            int add=num[--n]+carry;
            
            carry=add/10;
            al.add(add%10);
            
        }
        while(k>0)
        {
            int add=k%10+carry;
            k=k/10;
            carry=add/10;
            al.add(add%10);
            
        }
        if(carry>0)
            al.add(carry);
        
        Collections.reverse(al);
        return al;
    }
}