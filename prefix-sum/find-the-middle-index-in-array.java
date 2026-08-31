class Solution {
    public int findMiddleIndex(int[] nums) {

        int[] psum = new int[nums.length];

        int sum = 0;
        for(int i = 0 ; i<nums.length ; i++){
            psum[i] = sum;
            sum+=nums[i];
        }
        int ssum = 0;
        int ans = -1;
        for(int i = 0 ; i<nums.length ; i++){
            if(sum-nums[i]==ssum){
                ans = i;
                break;
            }
            sum-=nums[i];
            ssum+=nums[i];
        }
        return ans;
    }
}