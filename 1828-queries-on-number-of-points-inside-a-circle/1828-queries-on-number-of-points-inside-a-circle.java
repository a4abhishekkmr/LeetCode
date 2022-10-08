class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        //we need to find all the points which are inside or at the edge of particular circle so that it will be returned to answer
        
        //Basic Maths
        //Distance of two points is Sq.root(x-x1)^2 +(y-y1)^2 and we need this to be less than or equal to r*r.. since we are given only 500 points so we can consider for brute force apprach of N^2 approach
        
        //x and y will be cordinates of centre of circle and x1,y1 will be the points to check..
            //better than sorting and picking as that might be risky for out of radius
            //Thus, we need - (circle_center_x - x1) ^ 2 - (circle_center_y - y1) ^ 2 <= r * r for a point to be inside the circle.
        
        //int count=0;
        int res[]=new int[queries.length];
        
        for(int i=0;i<queries.length;i++)
        {
            int x=queries[i][0],y=queries[i][1],r=queries[i][2];
            for(int j=0;j<points.length;j++)
            {
                if((x-points[j][0])*(x-points[j][0])+(y-points[j][1])*(y-points[j][1])<=(r*r))
                    res[i]++;
            }
            
        }
        return res;
    }
}