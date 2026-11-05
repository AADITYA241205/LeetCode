class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
        List<List<Integer>> ls = new ArrayList();

        Arrays.sort(nums);

        int j = lower;
        int k = upper;

        for (int i = 0; i < nums.length; i++) {

            if(nums[i]<lower){
                continue;
            }

            if (nums[i] > upper) {
                break;
            }

            if (nums[i] > j) {
                List<Integer> ans = new ArrayList();
                ans.add(j);
                ans.add(nums[i] - 1);
                ls.add(ans);

            }
            j = nums[i] + 1;

        }

        if (j <= k) {
            List<Integer> ans = new ArrayList();
            ans.add(j);
            ans.add(k);
            ls.add(ans);
        }

        return ls;
    }
}