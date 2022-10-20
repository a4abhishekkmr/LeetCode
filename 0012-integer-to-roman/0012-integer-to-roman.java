class Solution {
    public String intToRoman(int num) {
        
        /* ok so what i have to do is i habe to take for all powers like num=1994,
        then i have to solve it as broken form like 1000+900+90+4
        now we have M = 1000, CM = 900, XC = 90 and IV = 4.
        which all sum make it as "MCMXCIV".
        
        I have to pass a number in function like 1000,900 and so on which will return its roman numbers in return
        so, i will turn by turn pass numbers like 1*1000 and so on.
        here is the code*/
        
        //I will pass from smaller ends and then store them into an arrayList and finally will Merge them.
        
        ArrayList<String> reverse= new ArrayList<>();
        
        int power=1;
        while(num>0)
        {
            int d=num%10;
            int numformed=d*power;
            reverse.add(roman(numformed));
            power=power*10;
            num=num/10;
        }
        
        StringBuilder sb=new StringBuilder();
        
        for(int i=reverse.size()-1;i>=0;i--)
            sb.append(reverse.get(i));
        
        return sb.toString();
    }
    
    String roman(int n)
    {
        StringBuilder sb=new StringBuilder();
        
        if(n==0) return "";
        if(n<=3)
        {
            for(int i=0;i<n;i++) {sb.append("I");} return sb.toString();
        }
        if(n==4) {return "IV";}
        if(n<=8) {
            sb.append("V"); 
        for(int i=0;i<(n-5);i++) 
            sb.append("I");
            
        return sb.toString();}
        if(n==9) {return "IX";}
        if(n<=30) {
            sb.append("X"); 
        for(int i=0;i<((n-1)/10);i++) 
            sb.append("X");
            
        return sb.toString();}
        if(n==40) {return "XL";}
        if(n<=80) {
            sb.append("L"); 
        for(int i=0;i<((n-50)/10);i++) 
            sb.append("X");
            
        return sb.toString();}
        if(n==90) {return "XC";}
        if(n<=300) {
            sb.append("C"); 
        for(int i=0;i<((n-100)/100);i++) 
            sb.append("C");
            
        return sb.toString();}
        if(n==400) {return "CD";}
        if(n<=800) {
            sb.append("D"); 
        for(int i=0;i<((n-500)/100);i++) 
            sb.append("C");
            
        return sb.toString();}
        if(n==900) {return "CM";}
        if(n<=3000) {
            sb.append("M"); 
        for(int i=0;i<((n-1000)/1000);i++) 
            sb.append("M");
            
        return sb.toString();}
        return sb.toString();
    }
}