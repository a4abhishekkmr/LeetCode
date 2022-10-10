class Solution {
    public String breakPalindrome(String palindrome) {
        //hint 1-  impossible to perform the replacement
        if(palindrome.length()==1) return "";
        String ans="";
        
        //hint 2 - Change the first non 'a' character to 'a'.
        if(palindrome.charAt(0)!='a')
        {
            return 'a'+palindrome.substring(1);
        }
        
        //hint 3 - if all chars are a.
        boolean allA=true;
        for(int i=0;i<palindrome.length();i++)
            if(palindrome.charAt(i)!='a'){
                allA=false;break;
            }
        
        if(allA==true) return palindrome.substring(0,palindrome.length()-1)+'b';
        //for aaaa returning aaab. which will be the least instead of baaa
        
        //now since last char is not a so we will return all with last char as small(b)
        // for(int i=1;i<palindrome.length()-1;i++)
        //     if(palindrome.charAt(i)!='a')
        //     {
        //         return palindrome.substring(0,i)+'a'+palindrome.substring(i+1,palindrome.length());
        //     }
        
        
        for(int i=0;i<palindrome.length()/2;i++){
           if(palindrome.charAt(i)!='a'){
                return palindrome.substring(0,i)+'a'+palindrome.substring(i+1,palindrome.length());
            }
        }
        
        return palindrome.substring(0,palindrome.length()-1)+'b';
    }
}