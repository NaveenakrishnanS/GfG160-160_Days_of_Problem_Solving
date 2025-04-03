class Solution:
    '''
        Approach: one Pass
        1. Initialize lMin to the first element of prices and profit to 0.
        2. Iterate through the prices starting from the second element.
        3. For each price, update lMin to be the minimum of lMin and the current price.
        4. Calculate the potential profit by subtracting lMin from the current price.
        5. Update profit to be the maximum of profit and the potential profit.
        6. Return profit.
        Time Complexity: O(n), where n is the number of prices.
        Space Complexity: O(1), as we are using only a constant amount of space.
    '''
    # Function to find the maximum profit from stock prices with one transaction allowed.
    def maximumProfit(self, prices):
        n = len(prices)
        # Initialize lMin to the first element of prices and profit to 0.
        lMin = prices[0]
        profit = 0
        # Iterate through the prices starting from the second element.
        # For each price, update lMin to be the minimum of lMin and the current price.
        for i in range(1,n):
            # Calculate the potential profit by subtracting lMin from the current price.
            lMin = min(lMin, prices[i])
            # Update profit to be the maximum of profit and the potential profit.
            profit = max(profit, prices[i] - lMin)
        # Return profit.
        return profit