class Solution {
    public boolean checkStraightLine(int[][] cordinates) {
        if(cordinates.length==2) return true;//always makes a straigh line with 2 poins
            
            int dx=cordinates[1][0]-cordinates[0][0];
            
            int dy=cordinates[1][1]-cordinates[0][1];
            
        for(int i=2;i<cordinates.length;i++)
        {
            int x=cordinates[i][0];
            int y=cordinates[i][1];
            
            if(dx*(y-cordinates[1][1])!=dy*(x-cordinates[1][0])) return false;
        }
        return true;
       
        }
}