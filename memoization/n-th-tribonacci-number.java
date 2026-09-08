class Solution {
    public int rec(int n ,int t0 , int t1 , int t2){
        if(n<=2){
            return t2;
        }
        int ans = t0 +t1+t2;
        return rec(n-1,t1,t2,ans);

    }
    public int tribonacci(int n) {
        if(n==0)return 0;
        if(n==1)return 1;
        if(n==2)return 1;
        return rec(n,0,1,1);
    }
}