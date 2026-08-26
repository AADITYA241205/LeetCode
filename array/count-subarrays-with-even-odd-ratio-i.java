class Solution {
    public int countRatioSubarrays(int[] nums, int a, int b) {

        int ans = 0;

        for(int i = 0 ; i<nums.length ; i++){
        int ce = 0;
        int co = 0;

            for(int j = i ; j<nums.length ; j++){
                if(nums[j]!=0 && nums[j]%2==0){
                    ce++;
                }
                else{
                    co++;
                }

                if(co>0 && (long)ce*b <= (long) co*a ){
                    ans++;
                }
            }
            
        }

        return ans;
        
    }
}