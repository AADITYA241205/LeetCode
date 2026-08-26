class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int low = Integer.MIN_VALUE;
        int high = 0;
        for(int i = 0 ; i<weights.length ; i++){
            low = Math.max(low,weights[i]);
            high+=weights[i];
        }

        while(low<=high){
            int mid = low + (high-low)/2;

            if(check(weights , mid , days)){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }

        }
        return low;
    }

    boolean check(int[] weights , int mid , int days){
        int sum = 0;
        int c = 1;
        for(int i = 0 ; i<weights.length ; i++){
            sum+=weights[i];
            if(sum>mid){
                sum = weights[i];
                c++;
            }
        }

        return c<=days;

    }

}