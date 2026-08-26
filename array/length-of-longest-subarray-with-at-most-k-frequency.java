class Solution {
    public int maxSubarrayLength(int[] nums, int k) {

        int maxl = Integer.MIN_VALUE;
        HashMap<Integer,Integer> map = new HashMap<>();

        int j = 0;
        for(int i = 0 ; i<nums.length ; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);

            while(map.get(nums[i])>k){

                map.put(nums[j],map.get(nums[j])-1);
                j++;
            }

            maxl = Math.max(maxl,i-j+1);

        }

        return maxl;        
    }
}