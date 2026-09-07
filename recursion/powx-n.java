class Solution {
    public double power(double x , long n){
        if(n==0){
            return 1;
        }
        if(n==1){
            return x;
        }

        if(n%2==0){
            return power(x*x,n/2);
        }

        return x*power(x,n-1);

    }
    
    public double myPow(double x, int n) {

        long nn = n;
        if(nn<0)nn = (-1)*nn;


        if(n<0) return (double)(1.0/(double)power(x,nn));
        return power(x,n);

    }

}