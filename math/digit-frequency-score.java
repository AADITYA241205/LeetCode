class Solution {
    public int digitFrequencyScore(int n) {
        int sum = 0;
        int a = 0;
        while(n!=0){
            a = n%10;
            sum = sum + a ;
            n= n/10;
        }
        return sum;
    }
}