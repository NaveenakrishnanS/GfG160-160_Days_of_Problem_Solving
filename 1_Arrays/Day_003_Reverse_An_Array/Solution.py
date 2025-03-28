class Solution:

    '''
    function to reverse the array.
    arr: list of integers

        Time Complexity: O(n) - Iterating through the array once.
        Space Complexity: O(1) - No extra space is used for the array.

    Approach:
        1. Initialize two pointers, one at the start and one at the end of the array.
        2. Swap the elements at these two pointers - i and j.
        3. Move the pointers towards the center of the array.
        4. Repeat the process until the pointers meet or cross each other.
        5. Return the reversed array.
    '''
    def reverseArray(self, arr):
        n = len(arr)
        #Initialize a variable to keep track of the last index
        j = -1
        #Calculate the mid index of the array
        #This is done to avoid swapping the same element twice in case of odd length array
        mid = n/2
        #Iterate through the array and swap the elements at the two pointers
        for i in range(n):
            #If the first pointer is less than the mid index, swap the elements at the two pointers
            #If the second pointer is greater than the mid index, swap the elements at the two pointers
            #This is done to avoid swapping the same element twice in case of odd length array
            if(i<mid):
                #Swap the elements at the two pointers
                temp = arr[i]
                arr[i] = arr[j]
                arr[j] = temp
            #Decrement the second pointer
            j-=1


    '''
    function to reverse the array.
    arr: list of integers

        Time Complexity: O(n) - Iterating through the array once. 
        Space Complexity: O(1) - No extra space is used for the array.
    
    Approach:
        1. Get the length of the array.
        2. Iterate only till the middle of the array.
        3. Swap the elements at the current index and its corresponding index from the end.
        4. Continue this process until the middle of the array is reached.
        5. Return the reversed array.
        6. The array is reversed in place, so no new array is created.
        7. The original array is modified to be the reversed array.

    Note: This approach is more efficient than the previous one as it only requires a single loop with half the iterations.    
    '''
    def reverseArraySolTwo(self, arr):
        # Get the length of the array
        n = len(arr)
        # Iterate only till the middle of the array
        for i in range(n//2):
            # Swap the elements at the current index and its corresponding index from the end
            temp = arr[i]
            arr[i] = arr[n-i-1]
            arr[n-i-1] = temp
            

Solution = Solution()
# Approach 1: Using two pointers
# Example usage:
print("Approach 1: Using two pointers")
arr = [1, 2, 3, 4, 5]
Solution.reverseArray(arr)
print(arr)  # Output: [5, 4, 3, 2, 1]
arr = [1, 2, 3, 4, 5, 6]
Solution.reverseArray(arr)
print(arr)  # Output: [6, 5, 4, 3, 2, 1]

# Approach 2: Using a single loop
# Example usage:
print("Approach 2: Using a single loop")
arr = [1, 2, 3, 4, 5, 6]
Solution.reverseArraySolTwo(arr)
print(arr)  # Output: [6, 5, 4, 3, 2, 1]
arr = [1, 2, 3, 4, 5, 6 , 7 , 8]
Solution.reverseArraySolTwo(arr)
print(arr)  # Output: [8, 7, 6, 5, 4, 3, 2, 1]