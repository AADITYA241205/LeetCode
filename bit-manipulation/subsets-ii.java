class Solution {
    public void func(int[] nums , List<List<Integer>> ans , int i , List<Integer> arr){
        if(i==nums.length){
            ans.add(new ArrayList<>(arr));
            return;
        }
        arr.add(nums[i]);
        func(nums,ans,i+1,arr);
        arr.remove(arr.size() - 1);
        while (i + 1 < nums.length && nums[i] == nums[i + 1]) {
            i++;
        }

        func(nums,ans,i + 1,arr);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        int i = 0;
        func(nums,ans,i,arr);
        return ans;
    }
}
    