class Solution {
    public int minimizedMaximum(int n, int[] quantities) {

        int low  = 1;
        int high = 0;
        for(int i = 0 ; i<quantities.length ; i++){
            high = Math.max(quantities[i],high);
        }

        while(low<=high){
            int mid = low + (high-low)/2;

            if(check(quantities,mid,n)){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }

        }
        return low;
    }
    boolean check(int[] quantities , int mid , int n){
        long sum = 0;
        for(int i = 0 ; i<quantities.length ; i++){
            sum+=(quantities[i]+mid-1)/mid;
        }
        
        return sum<=n;
        
    }

}