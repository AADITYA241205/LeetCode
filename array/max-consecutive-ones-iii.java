class Solution {
    public int longestOnes(int[] nums, int k) {

        int low = 0;
        int a = 0;
        int ans = 0;
        for(int high = 0 ; high<nums.length ; high++){

            if(nums[high]==0)a++;

            while(a>k){
                if(nums[low]==0)a--;
                low++;                
            }

            ans = Math.max(ans,high-low+1);

        }
        return ans;
    }
}