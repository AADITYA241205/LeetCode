class Solution {
    public int splitArray(int[] nums, int k) {
        int low = Integer.MIN_VALUE;
        int high = 0;
        for(int i = 0 ; i<nums.length ; i++){
            low = Math.max(low,nums[i]);
            high+=nums[i];
        }

        while(low<=high){
            int mid = low + (high-low)/2;

            if(check(nums,mid,k)){
                high=mid-1;
            }
            else{
                low=mid+1;
            }

        }
        
        return low;
    }
    boolean check(int[] nums , int mid , int k){
        long sum = 0;
        int c = 1;
        for(int i = 0 ; i<nums.length ; i++){
            if(sum+nums[i]<=mid){
                sum+=nums[i];
            }
            else{
                sum=nums[i];
                c++;
            }
        }
        return c<=k;
    }
}