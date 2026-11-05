class Solution {
    public int countSpecialIntegers(int[] nums) {

        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();

        for(int i = 0; i<nums.length; i++){
            if (!map.containsKey(nums[i])){
                map.put(nums[i], new ArrayList<>());
            }
            map.get(nums[i]).add(i);
        }

        int ans = 0;

        for (ArrayList<Integer> list : map.values()){
            if (list.size() < 3){
                continue;
            }

            int a = list.get(1) - list.get(0);
            boolean flag = true;

            for (int i = 2; i < list.size(); i++) {

                if (list.get(i) - list.get(i-1) != a) {
                    flag = false;
                    break;
                }
            }

            if(flag){
                ans++;
            }
        }

        return ans;
    }
}