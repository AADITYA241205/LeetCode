class Solution {
    public int atmost(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int c = 0;
        int low = 0;

        for (int high = 0; high < nums.length; high++) {

            map.put(nums[high], map.getOrDefault(nums[high], 0) + 1);

            while (map.size() > k) {
                map.put(nums[low], map.getOrDefault(nums[low], 0) - 1);

                if (map.get(nums[low]) == 0) {
                    map.remove(nums[low]);
                }
                low++;
            }

            c += high - low + 1;

        }

        return c;
    }

    public int subarraysWithKDistinct(int[] nums, int k) {

        return atmost(nums, k) - atmost(nums, k - 1);

    }
}