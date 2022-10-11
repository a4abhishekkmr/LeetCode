class Solution {
    public int wateringPlants(int[] plants, int cap) {
        //ok easy peasy
        
        int steps=1;
        int capacity=cap;
        for(int i=0;i<plants.length-1;i++)
        {
            if(plants[i]<=capacity)
                capacity-=plants[i];
            
            if(plants[i+1]>capacity)
            {
                steps+=(i+1);//back
                steps+=(i+1);//comes back
                capacity=cap;
            }
            steps++;
        }
        return steps;
    }
}