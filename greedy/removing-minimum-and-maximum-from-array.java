class Solution {
    public int minimumDeletions(int[] nums) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int imin = 0;
        int imax = 0;

        for(int i = 0 ; i<nums.length ; i++){

            if(min>nums[i]){
                min = nums[i];
                imin = i;
            }

            if(max<nums[i]){
                max = nums[i];
                imax = i;
            }

        }

        int ans = Math.max(imin,imax)+1;
        ans = Math.min(ans, nums.length - Math.min(imin, imax));
        if(imin>imax){
            ans = Math.min(ans,imin+ 1 + (nums.length - imax));
            ans = Math.min(ans,imax+1 +(nums.length - imin));
        }
        else if(imin<imax){
            ans = Math.min(ans,imax+1+ (nums.length - imin));
            ans = Math.min(ans,imin+1+(nums.length - imax));
        }
        return ans;
        
    }
}