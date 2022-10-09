class Solution {
    public int minOperations(int n) {
        if(n%2==0)//even like 6
            //i need to find sum of odd till 6-1=(till 5)-> 1,3,5 is total of 3 length i,e n/2 length
            //sum of odd numbers of x length is x^2
        {
            return (n/2*n/2);
        }
        else
        {
            //now take a example of n=5 where 1,3,5,7,9 all 5 elements are there
            //we need to make all elements equals to 5(middle element)
            //so for this 1 has to move 4 times and 3 has to move 2 times.. so again sum of even numbers of 2+4
            
            //length of this even series is equal 2 which we get by 5/2;
            
            //sum of even x term is x(x+1);
            //so n/2*((n/2)+1)
            return (n/2)*((n/2)+1);
        }
            
    }
}