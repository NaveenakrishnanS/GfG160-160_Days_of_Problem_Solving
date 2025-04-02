class Solution {

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] prices = {80, 100, 90, 70, 60, 120, 130, 140, 150};
        System.out.println("Maximum Profit: " + sol.maximumProfit(prices)); // Output: 110
        System.out.println("Maximum Profit (Sol Two): " + sol.maximumProfitSolTwo(prices)); // Output: 110
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    // Approach: Greedy
    public int maximumProfit(int prices[]) {
        // If the prices array is empty or has only one element, return 0
        int maxProfit = 0;
        if (prices == null || prices.length <= 1) {
            return maxProfit;
        }
        int n = prices.length;
        // Iterate through the prices array
        for (int p=1; p<n;p++){
            // If the current price is greater than the previous price, add the difference to maxProfit
            // This simulates buying at the previous price and selling at the current price
            // This is a greedy approach where we take every opportunity to make a profit
            if(prices[p] > prices[p-1]){
                maxProfit += (prices[p] - prices[p-1]);
            }
        }
        // Return the total maximum profit
        return maxProfit;
    }


    // Time Complexity: O(n)
    // Space Complexity: O(1)
    // Approach: using Local Minima and Maxima
    public int maximumProfitSolTwo(int[] prices) {
        int n = prices.length;
        int lMin = prices[0];  // Local Minima
        int lMax = prices[0];  // Local Maxima
        int maxProfit = 0;

        int p = 0;
        // Iterate through the prices array
        while (p < n - 1) {
            
            // Find local minima
            while (p < n - 1 && prices[p] >= prices[p + 1]) { p++; }
            lMin = prices[p];
            
            // Local Maxima
            while (p < n - 1 && prices[p] <= prices[p + 1]) { p++; }
            lMax = prices[p];
            
            // Add current profit
            maxProfit += (lMax - lMin);
        }
        // Return the total maximum profit
        return maxProfit;
    }
}