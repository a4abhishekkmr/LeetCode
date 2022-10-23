class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
        //remove the colon with "" nospace and then fetch it as an integer. then total will be compared
        
        int[] store=new int[4];//array to store converted integers
        int j=0;
        for(int i=0;i<2;i++)
        {
            event1[i]=event1[i].replace(":","");
            event2[i]=event2[i].replace(":","");
            store[j++]=Integer.parseInt(event1[i]);
            store[j++]=Integer.parseInt(event2[i]);
        }
        
        for(int i=0;i<4;i++)
            System.out.println(store[i]);
        
        //condition maximum startime must be smaller than equal to minimum endtime
// if( Math.max(startTime1,startTime2)<=Math.min(endTime1,endTime2))
if( Math.max(store[0],store[1])<=Math.min(store[2],store[3]))
    return true;
        return false;
    }
}