class Solution {
    public String getHint(String secret, String guess) {
        /*given
            1 <= secret.length, guess.length <= 1000
            secret.length == guess.length
            secret and guess consist of digits only.
        //lets begin.
        so i'll have secret and guess. what i have to find is
        2 numbers x and y
        x means the chars which are in same position with equal value present in secret and guess
        y is lil diff this is the value of guess present in secret but in diff place.
        
        ..so i need to take HAshmap and then i can proceed with it.
        
        */
//         HashMap<Character,Integer> hm=new HashMap<>();
        
//         int x=0,y=0,n=secret.length();
        
//         ArrayList<Integer> skip=new ArrayList<>();
//         for(int i=0;i<n;i++)
//         {
//             char ch=secret.charAt(i);
//             char gu=guess.charAt(i);
//             if(ch==gu) {x++; skip.add(i);}
//             else
//                 hm.put(ch,hm.getOrDefault(ch,0)+1);//map.put(c, map.getOrDefault(c, 0) + 1);
//         }
//         for(int i=0;i<n;i++)
//         {
//             if(!skip.contains(i)){
//             char ch=guess.charAt(i);
//             if(hm.containsKey(ch))
//             {y++;
//              if(hm.get(ch)==1)
//                  hm.remove(ch);
//              else
//                  hm.put(ch,hm.get(ch)-1);
//             }
//             }//if skip
//         }
//         //return Integer.toString(x)+"A"+Integer.toString(y)+"B";
//         return new StringBuilder().append(x).append('A').append(y).append('B').toString();
        
        //let's optimize the space
        
        int sec[]=new int[10];
        int gues[]=new int[10];
        
         int x=0,y=0,n=secret.length();
        
        for(int i=0;i<n;i++)
        {
            char ch=secret.charAt(i);
            char gu=guess.charAt(i);
            if(ch==gu) {x++;}
            else
                {
                sec[ch-'0']++;
                gues[gu-'0']++;
            }
        }
        for(int i=0;i<10;i++)
            y+=Math.min(sec[i],gues[i]);
        
        return new StringBuilder().append(x).append('A').append(y).append('B').toString();
     }
}
// Complexity
// Time complexity:$$O(n) + O(10)$$
// Space complexity: $$O(20)$$