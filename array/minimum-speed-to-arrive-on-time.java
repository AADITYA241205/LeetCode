class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {

        int low = 1;
        int high = Integer.MAX_VALUE;
        if(hour<=dist.length-1) return -1;
        while(low<=high){
            int mid = low + (high-low)/2;

            if(check(dist,mid,hour)){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }

    boolean check(int[] dist , int mid , double hour){

        double sum = 0;
        for(int i = 0 ; i<dist.length-1 ; i++){
            sum+= Math.ceil((double)dist[i]/mid);
        }
        sum+= (double)dist[dist.length-1]/mid;

        return sum<=hour;

    }
}