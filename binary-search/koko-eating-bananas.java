class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int min = 1;
        int max = Integer.MIN_VALUE;

        for(int i = 0 ; i<piles.length ; i++){
            max = Math.max(max,piles[i]);
        }

        while(min<=max){
            int mid = min + (max-min)/2;
            if(check(piles , mid , h)){
                max = mid - 1;
            }
            else{
                min = mid + 1;
            }

        }
        return min;
    }

    public boolean check(int[] piles , int mid , int h){
        long sum = 0;
        for(int i = 0 ; i<piles.length ; i++){
            // sum+= piles[i]/mid;
            // if(piles[i]%mid!=0){
            //     sum+=1;
            // }
            sum += (piles[i]+mid-1)/mid;
        }
        if(sum<=h){
            return true;
        }
        return false;
    }
}