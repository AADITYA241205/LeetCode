class Solution {
    public int longestSubarray(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int low = 0;
        // int high = 0;
        int ans = 0;
        for (int high = 0; high < nums.length; high++) {

            List<Integer> ls = primeFactors(nums[high]);

            for (int p : ls) {
                map.put(p, map.getOrDefault(p, 0) + 1);
            }

            while (map.size() > k) {
                List<Integer> ls1 = primeFactors(nums[low]);
                for (int c : ls1) {
                    map.put(c, map.get(c) - 1);
                    if(map.get(c)==0){
                        map.remove(c);
                    }
                }
                low++;
                
            }
                ans = Math.max(ans,high-low+1);


        }

        return ans;

    }

    static List<Integer> primeFactors(int n) {
        List<Integer> factors = new ArrayList<>();

        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }

        if (n > 1) {
            factors.add(n);
        }

        return factors;
    }
}