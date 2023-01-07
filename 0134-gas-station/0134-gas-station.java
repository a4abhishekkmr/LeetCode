class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalgas = Arrays.stream(gas).sum();
        int totalCost = Arrays.stream(cost).sum();

        // Total gas is less than cost. we can't come back
        if(totalgas<totalCost){
            return -1;
        }

       int start=0;
       int remainingGas=0;
        for(int i=0; i<gas.length; i++){

            // Removing cost from gas amount
            remainingGas  = remainingGas + gas[i]-cost[i];

            // if remaining gas is negative we can't start
            if(remainingGas<0){

               // setting remaining equal 0
                remainingGas=0;

                
                // Example: gas = [1,2,3,4,5],
                //         cost = [3,4,5,1,2]
                //  at index 3 remainingGas is positive and we took start=3, suppose after few more elemnts remainingGas become -ve, so we can't take index 3. will move start to next elemnts and will set remainingGas=0
                // Note :- If there exists a solution, it is guaranteed to be unique


                // making start index = next element
                start= i+1;
            }
        }

        return start;
    }
}