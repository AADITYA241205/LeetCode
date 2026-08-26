class Solution {
    public int minPenalty(int period, int[] lights, int[] arrivalTime) {

        int max = 0;
        for(int i = 0 ; i<lights.length ; i++){
            max = Math.max(lights[i],max);
        }
        int ans = 0;
        for(int i = 0 ; i<arrivalTime.length ; i++){
            int r = arrivalTime[i]%period;
            if(r>=max){
                ans = Math.max(ans,period-r);
            }
        }

        return ans;
    }
}