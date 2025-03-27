class Solution:

    '''
    I followed two approaches to solve this problem.
    Solution 1:
        1. Initialize two variables to store the largest and second largest elements.
        2. Iterate through the array.
        3. If the current element is greater than the largest element, update the second largest element to the previous largest element and update the largest element to the current element.
        4. If the current element is smaller than the largest element but greater than the second largest element, update the second largest element to the current element.
        5. Return the second largest element.

        Time Complexity: O(n) 
        Space Complexity: O(1)

    Solution 2:
        1. Convert the array to a set to remove duplicates.
        2. Sort the set in descending order.
        3. If the length of the set is greater than 1, return the second element from the sorted set.
        4. If the length of the set is less than or equal to 1, return -1.
        
        Time Complexity: O(n log n) 
        Space Complexity: O(n) 

    '''

    # Function to find the second largest element in the array
    # Solution 1
    def getSecondLargest(self, arr):
        # Code Here
        largest = -1
        secondLargest = -1
        for i in range(len(arr)):
            if (arr[i] > largest):
                secondLargest = largest
                largest = arr[i]
                
            elif ((arr[i] < largest) and (arr[i] > secondLargest)):
                secondLargest = arr[i]
            
        return secondLargest

    # Function to find the second largest element in the array
    # Solution 2
    def get_second_largest(self, arr):
        # Code Here
        result = sorted(list(set(arr)))
        if len(result) > 1:
            return result[-2]
        else:
            return -1


solution = Solution()
# Example Test Cases - Solution 1
print(solution.getSecondLargest([4, 2, 9, 7, 5]))
print(solution.getSecondLargest([11, 11, 11, 11, 11]))
print(solution.getSecondLargest([10, 20, 24]))

# Example Test Cases - Solution 2
print(solution.get_second_largest([4, 2, 9, 7, 5]))
print(solution.get_second_largest([11, 11, 11, 11, 11]))
print(solution.get_second_largest([10, 20, 24]))

# Output
# 7
# -1
# 20
# 7
# -1
# 20
