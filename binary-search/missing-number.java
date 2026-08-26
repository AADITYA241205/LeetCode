class Solution {
    public int missingNumber(int[] nums) {
        for(int i = 0 ; i<nums.length ; i++){
            int count = 0;
            for(int j = 0 ; j<nums.length ; j++){
                if(i == nums[j]){
                    count++;
                }
            }
            if(count==0){
                return i; 
            }
        }
        return nums.length;
    }
}