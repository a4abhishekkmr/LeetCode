class Solution {
    public int findKthLargest(int[] nums, int k) {
        //O(nlog n) Naive SOlution
        // Arrays.sort(nums);
        // if(k==1) return(nums[nums.length-1]);
        // if(k>nums.length)
        // k=k%nums.length;
        // return nums[nums.length-k];
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(k);//alloted size
        for(int el : nums){
            pq.offer(el);
            if(pq.size() > k){
                pq.poll();
            }
        }
        System.out.print(pq);
         return pq.peek();
        
    }
}