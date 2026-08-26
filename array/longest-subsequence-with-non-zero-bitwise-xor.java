class Solution {
    public int longestSubsequence(int[] nums) {

        long total = 0;
        int xr =0;
        for(int i = 0 ; i<nums.length ; i++){
            xr^=nums[i];
            total+=nums[i];
        }
        if(total==0)return 0;
        if(xr==0)return nums.length-1;
        else return nums.length;
        
    }
}