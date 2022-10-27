/*
Intuition:
If we do brute force, we have 2N horizontal possible sliding, 2N vertical sliding and N^2 to count overlap area.
We get O(N^4) solution and it may get accepted.
But we waste out time on case of sparse matrix.


Explanation:
Assume index in A and B is [0, N * N -1].

Loop on A, if value == 1, save a coordinates i / N * 100 + i % N to LA.
Loop on B, if value == 1, save a coordinates i / N * 100 + i % N to LB.
Loop on combination (i, j) of LA and LB, increase count[i - j] by 1.
If we slide to make A[i] orverlap B[j], we can get 1 point.
Loop on count and return max values.
I use a 1 key hashmap. Assume ab for row and cd for col, I make it abcd as coordinate.
For sure, hashmap with 2 keys will be better for understanding.


Complexity:
Assume A the number of points in the image A
B the number of points in the image B,
N = A.length = B.length.
O(N^2) time for preparing,
and O(AB) time for loop.
So overall O(AB + N^2) time.
Space is O(A + B).
*/
class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        
        ArrayList<Integer> al=new ArrayList<>();
        ArrayList<Integer> bl=new ArrayList<>();
        HashMap<Integer,Integer> hm=new HashMap<>();
        
        int N=img1.length;
        for(int i=0;i<N*N;i++)
        {
            if(img1[i/N][i%N]==1)
                al.add(i/N*100 + i%N);
        }
        for(int i=0;i<N*N;i++)
        {
            if(img2[i/N][i%N]==1)
                bl.add(i/N*100 + i%N);
        }
        for(int i:al)
        {
            for(int j:bl)
            {
                hm.put(i-j,hm.getOrDefault(i-j,0)+1);
            }
        }
        int count=0;
        for(int x:hm.values())
        {
            if(x>count)
                count=x;
                
        }
        return count;
    }
}