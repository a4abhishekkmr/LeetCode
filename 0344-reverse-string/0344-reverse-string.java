class Solution {
    public void reverseString(char[] s) {
        //if question is not to modify just return with another array then i would have made a String from all chars and then return reverse of it as a char array
            
            //using two pointer and swap
            int i=0;
            int j=s.length-1;
            
            
            while(i<j)
            {
                    char temp=s[i];
                    s[i]=s[j];
                    s[j]=temp;
                    i++;j--;
            }
            
            
    }
}