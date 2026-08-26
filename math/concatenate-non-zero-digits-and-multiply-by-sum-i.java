class Solution {
    public long sumAndMultiply(int n) {

        long count = 0;
        long ans = 0;
        long sum = 0;
        while(n>0){
            long a = n%10;
            if(a!=0){
            sum=sum+a;
            a = a*(long)Math.pow(10,count);
            ans = ans + a;
            count++;
            }
            n=n/10;
        }
        return ans*sum;
    }
}