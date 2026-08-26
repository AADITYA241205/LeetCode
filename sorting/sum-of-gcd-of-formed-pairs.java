class Solution {

     public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }


    public long gcdSum(int[] nums) {
        int max = 0;
        for(int i = 0 ; i<nums.length ; i++){
            if(nums[i]>max){
                max = nums[i];
            }
            nums[i] = gcd(nums[i],max);
        }

        Arrays.sort(nums);

        long ans = 0;

        int i = 0;
        int j = nums.length - 1;
        while(i<j){
            ans+= gcd(nums[i],nums[j]);
            i++;
            j--;
        }

        return ans;

    }
}