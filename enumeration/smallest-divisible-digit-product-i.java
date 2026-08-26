class Solution {
    public int smallestNumber(int n, int t) {

        while(true){
            int a = n;
            int prod = 1;
            while(a>0){
                int b = a%10;
                prod = prod*b;
                a=a/10;
            }
            if(prod%t==0){
                return n;
            }
            n++;
        }
    }
}