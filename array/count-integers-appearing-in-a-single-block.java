class Solution {
    public int countSpecialIntegers(int[] nums) {

        HashMap<Integer,Integer> map = new HashMap<>();

        map.put(nums[0],1);

        for(int i = 1 ; i<nums.length ; i++){

            if(nums[i]!=nums[i-1]){
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }
        }

        int c = 0;

        for(int i : map.keySet()){
            if(map.get(i)==1){
                c++;
            }
        }

        return c;
    }
}