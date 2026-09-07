class Solution {

    long MOD = 1000000007;
    public long pow(long ans , long i){
        if(i==0){
            return 1;
        }
        if(i==1){
            return ans;
        }

        if(i%2==0){
            return pow((ans*ans)%MOD,i/2);
        }

        return (ans*pow(ans,i-1))%MOD;

    }
    public int countGoodNumbers(long n) {
        
        return (int)((pow(5,(n+1)/2)*pow(4,n/2))%MOD);
    }
}