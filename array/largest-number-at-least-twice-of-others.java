class Solution {
    public int dominantIndex(int[] nums) {
        int max = 0;
        int max2 = 0;
        int a = 0;
        for(int i = 0 ; i<nums.length ; i++){
            if(max < nums[i]){
                max2 = max;
                max = nums[i];
                a = i;
            }
            else if(nums[i]>max2 && max>nums[i]){
                max2 = nums[i];
            }
        }

        if(max>=(max2*2)){
            return a;
        }
        else{
            return -1;
        }

    }
}