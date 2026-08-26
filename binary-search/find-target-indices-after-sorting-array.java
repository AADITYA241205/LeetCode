class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {

        for(int i = 1 ; i<nums.length ; i++){
            int key = nums[i];
            int j = i - 1;
            while(j>=0 && nums[j]>key){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1]=key;
        }
        List<Integer> ans = new ArrayList<>();
        for(int i = 0 ; i<nums.length ; i++){
            if(nums[i]==target){
                ans.add(i);
            }
        }
        return ans;
        
    }
}