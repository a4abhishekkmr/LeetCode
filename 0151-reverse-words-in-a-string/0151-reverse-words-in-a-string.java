class Solution {
    public String reverseWords(String s) {
        
        //trim-> The return type of trim() method is String. It returns the omitted string with no leading and trailing spaces. 
        
        //s=s.trim();
        
        String[] arr = s.split("\\s+");
        
        StringBuffer sb=new StringBuffer();
        
        for(int i=arr.length-1;i>=0;--i)
        {
            sb.append(arr[i]+" ");
            
        }
        return sb.toString().trim();
    }
}