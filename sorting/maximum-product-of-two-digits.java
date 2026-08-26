class Solution {
    public int maxProduct(int n) {
        
        int a = 0;
        int b = 0;
        while(n>0){
            int c = n%10;

            if(c>a){
                b=a;
                a=c;
            }
            else if(c>b){
                b=c;
            }

            n=n/10;
        }

        return a*b;
    }
}