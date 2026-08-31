class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for(int i = 0 ; i<nums.length ; i++){
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