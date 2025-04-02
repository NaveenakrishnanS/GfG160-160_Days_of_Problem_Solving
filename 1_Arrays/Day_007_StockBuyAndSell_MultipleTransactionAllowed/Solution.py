from typing import List


class Solution:
    
    # Function to find the maximum profit.
    # Time Complexity: O(n)
    # Space Complexity: O(1)
    # Approach: Greedy
    def maximumProfit(self, prices) -> int:
        n = len(prices)
        # If the array is empty or has only one element, return 0
        maxProfit = 0
        if (n <= 1):
            return maxProfit
        # Traverse the array
        for p in range(1,n):
            # If the current price is greater than the previous price, add the difference to maxProfit
            # This simulates buying at the previous price and selling at the current price
            # This is a greedy approach where we take every opportunity to make a profit
            if(prices[p] > prices[p-1]):
                maxProfit = maxProfit+(prices[p] - prices[p-1])
        # Return the result
        return maxProfit

    # Function to find the maximum profit.
    # Time Complexity: O(n)
    # Space Complexity: O(1)
    # Approach: Use Local Minima and Maxima
    def maximumProfitSolTwo(self, prices) -> int:
        n = len(prices)
        lMin = prices[0]  # Local Minima
        lMax = prices[0]  # Local Maxima
        maxProfit = 0
        # Traverse the array
        p = 0
        while p < n - 1:
            
            # Find local minima
            while p < n - 1 and prices[p] >= prices[p + 1]:
                p += 1
            lMin = prices[p]
            
            # Local Maxima
            while p < n - 1 and prices[p] <= prices[p + 1]:
                p += 1
            lMax = prices[p]
            
            # Add current profit
            maxProfit += (lMax - lMin)
        # Return the result
        return maxProfit
    
# Example usage
if __name__ == "__main__":
    prices = [100, 180, 260, 310, 40, 535, 695]
    sol = Solution()
    print("Maximum Profit:" , sol.maximumProfit(prices))  # Output: 865
    print("Maximum Profit (Sol Two):" , sol.maximumProfitSolTwo(prices))  # Output: 865