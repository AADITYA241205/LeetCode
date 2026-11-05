class Solution {
    public int minOperations(int[] nums, int x) {

        int sums= 0;

        for(int num : nums) {
            sums += num;
        }
        int a = sums - x;
        if(a<0){
            return -1;
        }

        if(a == 0){
            return nums.length;
        }

        int left = 0;
        int sum = 0;
        int maxLen = -1;

        for(int right = 0; right < nums.length; right++){
            sum += nums[right];

            while(sum > a && left <= right){
                sum -= nums[left];
                left++;
            }

            if(sum == a){
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }

        if(maxLen == -1){
            return -1;
        }

        return nums.length - maxLen;
    }
}