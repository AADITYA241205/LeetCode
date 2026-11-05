class Solution {
    public int[] getSneakyNumbers(int[] nums) {

        int[] arr = new int[nums.length];

        for(int i = 0 ; i<nums.length ; i++){
            arr[nums[i]]++;
        }

        int[] ans = new int[2];
        int j = 0;

        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i]>1){
                ans[j] = i;
                j++;
            }
        }
        
        return ans;
    }
}