class Solution {
    public int minDeletionSize(String[] str) {
        
        //move row wise as first for loop then iterate for whole column in particular i
        //for ex ["cba","daf","ghi"]
        
        int count=0;
        for(int i=0;i<str[0].length();i++)//iterate over cba
        {
            for(int j=0;j<str.length-1;j++)//iterate for ith posotion of all String array like 0th for all cba,daf,ghi=> c ,d , g
            {
                char up=str[j].charAt(i);
                char down=str[j+1].charAt(i);
                if(up>down)
                {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}