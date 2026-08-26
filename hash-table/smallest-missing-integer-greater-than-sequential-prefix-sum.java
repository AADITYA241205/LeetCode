class Solution {
    public int missingInteger(int[] nums) {

        int sum = nums[0];
        for(int i = 1 ; i<nums.length ; i++){
            if(nums[i]-nums[i-1]==1){
                sum+=nums[i];
            }
            else{
                break;
            }
        }

        while(true){
            int c = 0;
            for(int j = 0 ; j<nums.length ; j++){
                if(sum==nums[j]){
                    c++;
                }
            }
            if(c==0){
                break;
            }
            sum++;
        }
        return sum;
    }
}