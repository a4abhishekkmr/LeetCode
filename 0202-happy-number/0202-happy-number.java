class Solution {
    public boolean isHappy(int n) {
        int square=0;
        
        while(n>9)
        {
            while(n>0)
            {
                int rem=n%10;
                square+=(rem*rem);
                n=n/10;
            }
            n=square;
            square=0;
        }
        if(n==1|| n==7) return true;
        else return false;
    }
}
//Another good Solution
// class Solution {
//     public boolean isHappy(int n) {
//        if( n==1 || n==7) return true;// only two numbers less than 9 are happy
//         else if(n < 10) return false;// and all others are not
//         int m =0;
//         while(n != 0){
//             int tail = n %10;//getting last the digit
//             m = m + tail*tail;
//             n = n/10;//eliminatting the used digit
//         }
//         return isHappy(m);
//     }
// }