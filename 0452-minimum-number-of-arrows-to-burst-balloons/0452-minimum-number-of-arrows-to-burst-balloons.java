/*
Approach
Look, first we need to sort the array from right column wise.So,
Step 1-> sort it column wise using comparator.

Step 2-> Now If we find that the right side range is greater than second elements of left side for eg= {1,4},{3,5}--> so here, 4>3, so in these types of cases we know that in one shot only directly it will gonna burst the ballon so we frstly ignore these case.

Step 3-> As soon as we find that right side is smaller than left side of another elements, we increament the count by 1, because here we get sure that abosuletely there is no way we could burst both ballons at instant.

Step 4-> we change the value of target as right side of next element.

*/
//code:-


class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));
        int count=1;//Initially count will always be 1
        int target=points[0][1];
        for(int i=1;i<points.length;i++){
            if(target<points[i][0]){//Check if target is smaller than left side of element
                count+=1;
                target=points[i][1];//Update target
            }
        }
        return count;
    }
}