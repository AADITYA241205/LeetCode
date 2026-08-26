class Solution {
    public int maxDigitRange(int[] nums) {
        int[] arr = new int[nums.length];
        int max = 0;
        for(int i = 0 ; i<nums.length ; i++){
            int a = nums[i];
            int lar = Integer.MIN_VALUE;
            int sml = Integer.MAX_VALUE;
            while(a>0){
                int b = a%10;
                if(b>lar){
                    lar = b;
                }
                if(sml>b){
                    sml = b;
                }
                a = a/10;
            }
            int ran = lar - sml;
            arr[i] = ran;
            if(ran>=max){
                max = ran;
            }
        }
        int ans = 0;
        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i] == max){
                ans += nums[i];
            }
        }
        return ans;
    }
}