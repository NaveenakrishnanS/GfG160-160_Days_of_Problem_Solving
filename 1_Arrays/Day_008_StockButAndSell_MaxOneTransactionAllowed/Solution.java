class Solution {

    /**
     * Approach: One Pass
     * Function to find the maximum profit from stock prices
     * The function iterates through the array of prices and keeps track of the minimum price seen so far.
     * It calculates the profit by subtracting the minimum price from the current price and updates the maximum profit if necessary.
     * Finally, it returns the maximum profit.
     * 
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     * @param prices
     * @return
     */
    // Function to find the maximum profit from stock prices
    public int maximumProfit(int prices[]) {
        // Initialize the minimum price to the first element of the array
        int lMin = prices[0];
        // Initialize the maximum profit to 0
        int profit = 0;
        // Iterate through the array starting from the second element
        // Update the minimum price and maximum profit as necessary
        for(int i=1; i<prices.length; i++){
            // Update the minimum price if the current price is lower
            lMin = Math.min(lMin, prices[i]);
            // Calculate the profit by subtracting the minimum price from the current price
            // Update the maximum profit if the current profit is higher
            profit = Math.max(profit, (prices[i] - lMin));
        }
        // Return the maximum profit
        // The maximum profit is the maximum difference between the current price and the minimum price seen so far
        return profit;
    }
}