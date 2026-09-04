class Solution {
    public int firstStableIndex(int[] nums, int k) {

        int max = 0;
        int ans = -1;
        for(int i = 0 ; i<nums.length ; i++){
            max = Math.max(max,nums[i]);

            int min = Integer.MAX_VALUE;
            for(int j = i ; j<nums.length ; j++){
                min = Math.min(min,nums[j]);
            }

            System.out.println(max +" "+ min);

            if((max-min)<=k){
                ans = i;
                break;
            }

        }
        return ans;
    }
}