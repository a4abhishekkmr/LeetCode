class Solution {
    public int countVowelStrings(int n) {
      //from maths calculation and Combination as selection what i found is answer will be to choose 4 from n+4 elements so ans will be (n+4)C 4
        
        //but taking out fact(50) which is huge number a big task so take
        return (n+1)*(n+2)*(n+3)*(n+4)/24;
    }
    
}