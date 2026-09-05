class Solution {
    public int firstStableIndex(int[] nums, int k) {

        int max = 0;
        int amin[] = new int[nums.length];
        int min = Integer.MAX_VALUE;
        int ans = -1;

        for(int i = nums.length-1 ; i>=0 ; i--){
            min = Math.min(min,nums[i]);
            amin[i] = min;
        }

        for(int i = 0 ; i<nums.length ; i++){
            max =  Math.max(max,nums[i]);

            if(max-amin[i]<=k){
                ans = i;
                break;
            }
        }
        return ans;
    }
}