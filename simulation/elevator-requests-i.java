class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int a = 0;
        int ans = 0;

        for(int i = 0 ; i<requests.length ; i++){
            ans += Math.abs(a-requests[i]);
            a = requests[i];
        }
        return ans;
                
    }
}