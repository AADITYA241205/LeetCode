class Solution {
    public int[] leftRightDifference(int[] nums) {

        int[] ls = new int[nums.length];
        int[] rs = new int[nums.length];

        int lss = 0;
        for(int i = 0 ; i<nums.length ; i++){
            ls[i] = lss;
            lss+=nums[i];
        }

        int rss = 0;
        for(int i = nums.length - 1 ; i>=0 ; i--){
            rs[i] = rss;
            rss+=nums[i];
        }

        int[] ans = new int[nums.length];

        for(int i = 0 ; i<nums.length ; i++){
            ans[i] = Math.abs(ls[i] - rs[i]);
        }
        
        return ans;
    }
}