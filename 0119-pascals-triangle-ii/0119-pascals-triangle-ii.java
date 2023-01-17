//Intitution:-
/*
This solution here, is Linear in time.

As you know you can get any element of Pascal's Triangle in O(N) time and constant space complexity.
for first row first column we have 1C1
for second row first column we have 2C1
for second row second column we have 2C2
..... and so on
Therefore we can infer, for ith row and jth column we have the number iCj

And calculating this is pretty easy just in N time (factorial basically).

==> nCr = n*(n-1)*(n-2)...(r terms) / 1*2*..........*(r-2)*(r-1)*r

Now the question asks us to find the complete row.
If we calculate all the elements in this manner it would be quadratic in time. But, since its formula is pretty sleek, we proceed as follows:

suppose we have nCr and we have to find nC(r+1), like 5C3 and 5C4
==> 5C3 = 5*4*3 / 1*2*3

to get the next term we multiply numerator with its next term and denominator with its next term. As,
==> 5C4 = 5*4*3 * 2 / 1*2*3 * 4

We are following this simple maths logic to get the complete row in O(N) time.

Note:- We didnt actually need the variable temp. But the test cases are such that multiplying in one case exceeds the int range, and since we cannot change return type we have to take the long data type variable as temporary.*/

class Solution {
    public List<Integer> getRow(int row) {
        
        
        
        ArrayList<Integer> al=new ArrayList<>();
        
        if(row==0)
        {
            al.add(1);
            return al;
        }
        if(row==1)
        {
            al.add(1);
            al.add(1);
            return al;
        }
        
        al.add(1);
        long temp=1;
        
        for(int i=1,up=row,down=1;i<=row;i++,up--,down++)
        {
            temp=temp*up/down;
            al.add((int)temp);
        }
        return al;
    }
}
/*
class Solution {
    public List<Integer> getRow(int rowIndex) {
        Integer[] ans = new Integer[rowIndex + 1];
        ans[0] = 1;

        for (int r = 1; r <= rowIndex; r++) {
            ans[r] = (int) ((long) ans[r - 1] * (rowIndex - r + 1) / r);
        }

        return Arrays.asList(ans);
    }
}

// TC: O(n), SC: O(n)
*/