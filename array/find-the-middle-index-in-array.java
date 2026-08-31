class Solution {
    public int findMiddleIndex(int[] nums) {

        int[] psum = new int[nums.length];
        int[] ssum = new int[nums.length];
        int sum = 0;
        for(int i = 0 ; i<nums.length ; i++){
            psum[i] = sum;
            sum+=nums[i];
        }
        sum = 0;
        int ans = -1;
        for(int i = nums.length-1 ; i>=0 ; i--){
            if(sum==psum[i]){
                ans = i;
                break;
            }
            sum+=nums[i];
        }
        return ans;
    }
}