class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {

        int c = 0;
        int low = 0;
        int sum = 0;

        for (int high = 0; high < nums.length; high++) {

            sum += nums[high];

            while (sum > goal) {
                sum -= nums[low];
                // if(nums[low]==0)c++;
                low++;
            }

            if (sum == goal) {
                System.out.println(nums[low]);

                System.out.println(c);
                int st = low;
                while (st <= high && nums[st] == 0) {
                    st++;
                    c++;
                }
                if (st<nums.length && nums[st] == 1){
                    c++;
                }
            }
        }
        return c;
    }
}