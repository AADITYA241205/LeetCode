class Solution {
    public double myPow(double x, int n) {
        if(n==0){
            return 1;
        }
        
        if(x==0){
            return x;
        }
        // if(n<0)n*=-1;
        
        if(n>0){
            return x*myPow(x, n-1);
        }
        else{
            n*=-1;
            return 1/(x*myPow(x, n-1));
        }
    }
}