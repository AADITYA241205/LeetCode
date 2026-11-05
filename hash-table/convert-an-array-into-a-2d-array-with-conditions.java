class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();

        int[] freq = new int[nums.length + 1];

        for(int num : nums){
            int a = freq[num];

            if(a==ans.size()){
                ans.add(new ArrayList<>());
            }

            ans.get(a).add(num);
            freq[num]++;
        }

        return ans;
    }
}
