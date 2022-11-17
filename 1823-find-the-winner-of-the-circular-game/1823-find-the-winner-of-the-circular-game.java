class Solution {
    public int findTheWinner(int n, int k) {
        //I can solve it using a circular queue or may somone says by arrayList but here i am using a queue
            //where pops from front side and pushes into back side
            //what i will do is i will push all the non removing k-1 elements to back and then remove the first one(pop).. will do till the length!=1 and the final length=1 contains the element which is our answer
            
            Queue<Integer> q= new LinkedList<>();
            //input all;
            for(int i=1;i<=n;i++)
                    q.add(i);
            
            while(q.size()!=1)
            {
                    int len=k-1;//length to be passed back side
                    while(len-->0)
                    {
                            int temp=q.peek();
                            q.poll();
                            q.add(temp);
                    }
                    q.poll();
            }
            
            return q.peek();
    }
}