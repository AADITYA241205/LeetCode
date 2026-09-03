class Solution {
    public boolean uniformArray(int[] nums1) {

        int min = Integer.MAX_VALUE;
        boolean flag = false;
        for(int i = 0 ; i<nums1.length ; i++){
            min = Math.min(nums1[i],min);
            if(nums1[i]%2!=0){
                flag = true;
            }
        }

        if(min%2!=0){
            return true;
        }
        else{
            if(flag)return false;

            return true;
        }
        
    }
}