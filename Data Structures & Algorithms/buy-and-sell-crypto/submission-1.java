class Solution {
    public int maxProfit(int[] prices) {
        int i = 0;
        int j = 1;
        int result = 0;

        while (j < prices.length) {
            result = Math.max(prices[j] - prices[i], result);

            if (prices[i] > prices[j]) {
                i = j;
                j++;
            } else {
                j++;
            }
        }

        return result;
    }
}
