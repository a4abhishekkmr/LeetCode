// class Solution {
//     public int characterReplacement(String s, int k) {
//         /*given:-
//         1 <= s.length <= 105
//         s consists of only uppercase English letters.
//         0 <= k <= s.length
        
//         //ok so we need to find the way we can do this problem.
//         //getting clue of two pointers 
//         //first i am going with naive approach
//         where i will be going from all the chars and find the length with a substring which contains k diff chars
        
//         */
        
//         int n=s.length();
        
//         int mistake=k;
        
//         int dist=0,maxdist=0;
//         for(int i=0;i<n-1;i++)
//         {
//             char lo=s.charAt(i);
//             for(int j=i+1;j<n;j++)
//             {
//                 char hi=s.charAt(j);
//                 if(lo==hi) dist=j-i+1;
//                 else if(lo!=hi && mistake<=0) break;
//                 else if(lo!=hi)
//                 {
//                     mistake--;
//                     dist=j-i+1;
//                 }
//                 maxdist=Math.max(dist,maxdist);
//             }
//         }
//         return maxdist;
//     }
// }

class Solution {
    public int characterReplacement(String s, int k) {
        HashSet<Character> allLetters = new HashSet();

        // collect all unique letters
        for (int i = 0; i < s.length(); i++) {
            allLetters.add(s.charAt(i));
        }

        int maxLength = 0;
        for (Character letter : allLetters) {
            int start = 0;
            int count = 0;
            // initialize a sliding window for each unique letter
            for (int end = 0; end < s.length(); end += 1) {
                if (s.charAt(end) == letter) {
                    // if the letter matches, increase the count
                    count += 1;
                }
                // bring start forward until the window is valid again
                while (!isWindowValid(start, end, count, k)) {
                    if (s.charAt(start) == letter) {
                        // if the letter matches, decrease the count
                        count -= 1;
                    }
                    start += 1;
                }
                // at this point the window is valid, update maxLength
                maxLength = Math.max(maxLength, end + 1 - start);
            }
        }
        return maxLength;
    }

    private Boolean isWindowValid(int start, int end, int count, int k) {
        return end + 1 - start - count <= k;
    }
}