class Solution {
    public int mySqrt(int x) {
        
        long low = 1;
        long high = x;

        while(low<=high){
            long mid = low + (high-low)/2;

            if((long)mid*mid==(long)x) return (int)mid;

            if((long)mid*mid>x){
                high = mid -1;
            }
            else{
                low = mid + 1;
            }

        }

        return (int)high;

    }
}