class Solution {
    public int largestInteger(int[] nums, int k) {

        if(k==nums.length){
            int ans = -1;
            for(int i = 0 ; i<nums.length ; i++){
                ans = Math.max(nums[i],ans);
            }

            return ans;
        }
        if(k==1){
            Map<Integer, Integer> map = new HashMap<>();
            for(int i = 0; i < nums.length; i++){
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            }
            int ans = -1;
            for(int i = 0; i < nums.length; i++){
                if(map.get(nums[i]) == 1){
                    ans = Math.max(ans, nums[i]);
                }
            }
            return ans;
        }

        int a = nums[0];
        int b = nums[nums.length - 1];
        int c1 = 0;
        int c2 = 0;

        for(int i = 0 ; i<nums.length ; i++){
            if(a==nums[i]){
                c1++;
            }
            if(b==nums[i]){
                c2++;
            }
        }
        if(a==b)return -1;
        if(c1==c2 && c1==1) return (int)Math.max(a,b);
        if(c1==1)return a;
        if(c2==1)return b;
        else return -1;

    }
}