class Solution {
    public boolean checkDivisibility(int n) {

        int a = n;
        int sum = 0;
        int prod = 1;

        while(n>0){
            sum+=n%10;
            prod*=n%10;
            n=n/10;
        }

        if(a%(sum+prod)==0)return true;
        return false;
        
    }
}