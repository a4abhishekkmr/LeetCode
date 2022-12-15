/*
algorithm: dymanic programming. M[i][j] be the LCS(Longest Common Subsequence) from text1[0 ... i - 1],
and text2[0 ... j - 1], i and j stands for the length.
smallest problem:
    M[0][j] = 0     --> "" vs "..."
        M[i][0] = 0     --> "..." vs ""
        induction rule:
            M[i][j] = 1 + M[i - 1][j - 1] if text1[i - 1] == text2[j - 1]
                        = max(M[i - 1][j],      //skip current char in text1
                            M[i][j - 1],      //skip current char in text2
                            M[i - 1][j - 1]   //skip char in both text1 and text2
                    );
Complexity:
Time: O(mn), m is length of text1, n is length of text2
Space: O(mn) --> can be optimized to O(min(m, n)) since only accessing previous row
*/

class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n1=text1.length(),n2=text2.length();
        int dp[][]=new int[n1+1][n2+1];
        
        for(int i=1;i<=n1;i++)
        {
            for(int j=1;j<=n2;j++)
            {
                char ch=text1.charAt(i-1);
                char sh=text2.charAt(j-1);
                
                if(ch==sh) dp[i][j]=dp[i-1][j-1]+1;
                 else
                     dp[i][j]=Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        return dp[n1][n2];
    }
}