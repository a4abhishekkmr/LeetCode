class Solution {
    public String convert(String s, int Row) {
        
        int n=s.length();
        if(Row==1 || n<=Row) return s;
        
        //ok so for solving this, i have thought both the solutions either to make a 2d Matrix and to
        //solve the zigzag pattern of filling and lately to use stringbuilder to sum up all chars.
        
        //the second one is to jump into the string with a fixed number while saving the chars..
        //Another best solution will be to use StringBuilder and for each row using jump append and
        //then finally save all the strings from stringbuilder.''
        
        //1st solution:-
        
        
        //to find the width of the matrix we need to calculate it. and it will be like
        int m=s.length();
        //instead of calculating the colmns directly lets take the worst case or max which will be n
        char[][] mat=new char[Row][m];
        
        int i=0,j=0,it=0;//iterator
        
        while(it<m)
        {
            if(i==0)
            {
                while(i<Row && it<m)
                {
                    mat[i][j]=s.charAt(it);
                    it++;
                    i++;
                }
                j++;//column shift
            }
            else//back up diagonally
            {
                i=Row-2;//secondlast
                int count=0;
                while(it<m && count<Row-2)
                {
                    mat[i][j]=s.charAt(it);
                    it++;
                    count++;
                    i--;
                    j++;
                    
                }
                j++;
                i=0;//top row
            }
        }
      StringBuilder sb=new StringBuilder();
        
        for(i=0;i<mat.length;i++)
        {
            for(j=0;j<mat[0].length;j++)
            {
                if(mat[i][j]!=0)
                sb.append(mat[i][j]);
                }
        }
        return sb.toString();
        
    }
}
