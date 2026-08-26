class Solution {
    public int[] closestPrimes(int left, int right) {

        boolean[] prime = new boolean[right + 1];
        if (right >= 0) prime[0] = true;
        if (right >= 1) prime[1] = true;
        for (int i = 2; i*i <= right; i++) {
            if (!prime[i]) {
                for (int j = i*i; j<= right; j+=i) {
                    prime[j] = true;
                }
            }
        }

        int[] ans = { -1, -1 };

        int prev = -1;
        int min = Integer.MAX_VALUE;

        for (int i = left; i <= right; i++) {
            if (!prime[i]) {
                if (prev != -1) {
                    int gap = i - prev;
                    if (gap < min) {
                        min = gap;
                        ans[0] = prev;
                        ans[1] = i;
                    }
                }
                prev = i;

            }
        }

        return ans;
    }
}