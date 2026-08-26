class Solution {
    public boolean isPowerOfTwo(int n) {
        for(int i = 0 ; i<=n;i++){
            double b = Math.pow(2,i);
            if(b==n){
                return true;
            }
            else if(b>n){
                return false;
            }
        }
        return false;
    }
}