class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        int four=10000;
        int nine=1000000000;
        boolean heavy=false;
        if(mass>=100) heavy=true;
        
        boolean bulky=false;
        
        long vol=(long)((long)length*(long)width*(long)height);
        if(length>=four || width>=four || height>=four || vol>=nine)
            bulky=true;
        
        if(bulky==true && heavy==true) return "Both";
        else if(bulky==false && heavy==false) return "Neither";
        else if(bulky==true) return "Bulky";
        else return "Heavy";
    }
}