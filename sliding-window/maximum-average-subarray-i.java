class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        
        int sum = 0;
        for(int i = 0 ; i<k ; i++){
            sum+=nums[i];
        }
        double avg = (double)sum/k;
        int low = 0;

        for(int high = k ; high<nums.length ; high++){

            sum-=nums[low];
            low++;

            sum+=nums[high];

            avg = Math.max(avg,(double)sum/k);

        }

        return avg;
    }
}