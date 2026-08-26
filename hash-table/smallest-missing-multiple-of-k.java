class Solution {
    public int missingMultiple(int[] nums, int k) {

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0 ; i < nums.length  ; i++){
            map.put(nums[i] , map.getOrDefault(nums[i],0)+1);
        }

        int i = 1;
        while(true){
            if(!map.containsKey(k*i)){
                return k*i;
            }
            i++;
        }
    }
}