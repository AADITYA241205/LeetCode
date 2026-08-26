class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        long sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int low = 0;
        long maxsum = 0;

        while (low < k) {
            map.put(nums[low], map.getOrDefault(nums[low], 0) + 1);
            sum += nums[low];
            low++;
        }

        if (map.size() == k) {
            maxsum = sum;
        }

        low = 0;

        for (int high = k; high < nums.length; high++) {
            map.put(nums[low], map.get(nums[low]) - 1);
            sum -= nums[low];
            if (map.get(nums[low]) == 0) {
                map.remove(nums[low]);
            }
            low++;

            map.put(nums[high], map.getOrDefault(nums[high], 0) + 1);
            sum += nums[high];
            if (map.size() == k) {
                maxsum = Math.max(maxsum, sum);
            }

        }
        return maxsum;
    }
}