class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        List<Integer> ans = new ArrayList<>();
        int min = 100;
        int max = 1;

        for(int i = 0 ; i<nums.length ; i++){
            if(nums[i]>max){
                max = nums[i];
            }

            if(nums[i]<min){
                min = nums[i];
            }
        }

        Arrays.sort(nums);
        for(int i = 0 ; i<nums.length ; i++){
            if(nums[i]!=min){
                i--;
                ans.add(min);
            }
            min++;
        }
        return ans;
    }
}