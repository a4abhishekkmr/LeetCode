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

/*
//other answers will be
//class Solution {
    public String convert(String s, int numRows) {
        //we can use Char Array
        //char str[s.length()];
        StringBuilder str = new StringBuilder();
        numRows--;
        //if given row is 1 then return string
        if(numRows==0) return s;
        // i use for current row
        // j use for current element of current row
        for(int i=0, j=i , len=s.length(); i<=numRows;){
            //lower operation
            if(i!=numRows && j<len){
                str.append(s.charAt(j));
                j=j+(numRows-i)*2;
            }
            //upper operation
            if(i!=0 && j<len){
                str.append(s.charAt(j));
                j=j+i*2;
            }
            //change row and element position
            if(j>=len){
                i++;
                j=i;
            }
        }
        return str.toString();
    }
}


class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1) return s;
        StringBuilder[] arr = new StringBuilder[numRows];
        for(int i = 0 ; i < arr.length ; i ++) {
            arr[i] = new StringBuilder("");
        }
        boolean f = true;
        int i = 0; int j = 0;
        while(i < s.length()){
            char ch = s.charAt(i);

            arr[j].append(ch);

            if(f){
                j++;
            }else{
                j--;
            }
            if(j == numRows){
                j = numRows - 2;
                f = false;
            }else if(j ==-1){
                j+= 2;
                f= true;
            }
            i++;
        }
        for(i = 1 ; i < arr.length ; i ++){
            arr[0].append(arr[i]);
        }
        return arr[0].toString();
    }
}
*/