class Solution {
    public int sumDecoded(long[] nums) {

        long sum = 0;
        long MOD = 1000000007L;
        for(int i = 0 ; i<nums.length ; i++){
            long width = nums[i]%10;
            long d = (long)Math.floor(nums[i]/10);

            String a = d + "";

            long x = 0;

            for(int j = 0 ; j<width ; j++){
                x = x*10 + (a.charAt(j)-'0');
                
            }
            long y = 0;
            for(int j = (int)width ; j<a.length() ; j++){
                y = y*10 + (a.charAt(j)-'0');
                
            }
            long ans = power(x,y,MOD);

            sum = (sum+ans)%MOD;
            
        }
        return (int)sum;
    }

    private long power(long x, long y , long MOD) {
        long res = 1;
        x %= MOD;

        while (y > 0) {
            if ((y & 1) == 1) {
                res = res * x % MOD;
            }

            x = x * x % MOD;
            y >>= 1;
        }

        return res;
    }
}