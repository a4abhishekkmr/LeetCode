/*class Solution {
    public int closetTarget(String[] words, String target, int startIndex) {
        //ok so for this case i will go with both hand run
        //find the both left and right hand run and compare if yes then return the shortest index
        //finally return the min
        
        //right hand one circle
        int pos=startIndex;
        int n=words.length;
        
        int i= 0;
        int right=-1;
        boolean r=false;
        while(i<n-1)
        {
            pos=(pos+i)%n;
            System.out.println(pos);
            boolean found=check(words[pos],target);
                if(found)
                {
                    right=i;
                    r=true;
                    break;
                }
            i++;
        }
        
        pos=startIndex;
        
        i=0;
        int left=-1;
        boolean l=false;
        while(i<n-1)
        {
            pos=(pos-i+n)%n;
            System.out.println(pos+"a");
            boolean found=check(words[pos],target);
                if(found)
                {
                    left=i;
                    l=true;
                    break;
                }
            i++;
        }
        if(!r) return left;
        else if(!l) return right;
        else return Math.min(left,right);
    }
    
    private boolean check(String a,String b)
    {
        if(a.length()!=b.length()) return false;
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)!=b.charAt(i))
                return false;
                
        }
        return true;
    }
}
*/

class Solution {
    public int closetTarget(String[] words, String target, int startIndex) {
        
        //ok so in this ques i am going with a aux space array of boolean where ill be searching for the
        //same word if found then mark true
        //now from this resultant array i will calculate the nearest point from the start index
        
        int n=words.length;
        
        boolean arr[]=new boolean[n];
        
        for(int i=0;i<n;i++)
        {
            if(words[i].equals(target))
                arr[i]=true;
        }
        //resultant ready
        
        //now need to calculate
        int pos=startIndex;
        int min=n;
        for(int i=0;i<n;i++)
        {
            if(arr[i])
            {
                int r=Math.abs(pos-i);
                int l=Math.abs(n-r);
                System.out.println(l+"   "+r);
                min=Math.min(Math.min(r,l),min);
            }
        }
        if(min==n) return -1;
        else return min;
    }
}