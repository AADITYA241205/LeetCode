class Solution {
    public int countGoodRotations(int[] nums) {

        List<Integer> ls = new ArrayList<>();

        long t = 0;
        int a = nums.length/2;
        long s1 = 0;
        for(int i = 0 ; i<nums.length*2 ; i++){
            ls.add(nums[i%nums.length]);
            if(i<nums.length){
                t+=nums[i];
            }
            if(i<a){
                s1+=nums[i];
            }
            
        }
        int ans = 0;
        for(int i = 0 ; i<nums.length ; i++){

            long s2 = t - s1;

            
            if(s1>s2){
                ans++;
            }

            s1-=ls.get(i);
            s1+=ls.get(i+a);
            
        }

        return ans;
        
    }
}