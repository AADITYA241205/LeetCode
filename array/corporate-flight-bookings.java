class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {

        int[] ans = new int[n];

        for(int i = 0 ; i<bookings.length ; i++){

            int a = bookings[i][0]; 
            int b = bookings[i][1]; 
            int c = bookings[i][2]; 
            ans[a-1] += c;
            if(b<n){
                ans[b] -= c;
            }

        }

        for(int i = 1 ; i<n ; i++){
            ans[i]+=ans[i-1];
        }
        return ans;
    }
}