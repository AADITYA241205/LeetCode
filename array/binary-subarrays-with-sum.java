class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {

        int c = 0;
        int low = 0;
        int sum = 0;

        for (int high = 0; high < nums.length; high++) {

            sum += nums[high];

            while (sum > goal) {
                sum -= nums[low];
                low++;
            }

            if (sum == goal) {
                int st = low;
                
                while (st <= high && nums[st] == 0) {
                    st++;
                    c++;
                }
                if (st<=high && nums[st] == 1){
                    c++;
                }
            }
        }
        return c;
    }
}