class Solution {
    public double minPrice(int[] prices, int[] discounts) {

        Arrays.sort(prices);
        Arrays.sort(discounts);

        int i = prices.length - 1;
        int j = discounts.length - 1;

        double ans = 0;
        while(i>=0 && j>=0){
            ans +=  (double)((double)prices[i]*(100-(double)discounts[j])) / 100;
            i--;
            j--;
        }

        while(i>=0){
            ans += prices[i];
            i--;
        }

        return ans;
    }
}