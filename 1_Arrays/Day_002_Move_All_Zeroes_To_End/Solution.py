class Solution:

	'''
	'Function to push all zeroes to end of array without changing the order of non-zero elements.'
	
	Approach 1:
		1. Initialize a temporary array of the same size as the input array, filled with zeroes.
		2. Initialize a variable j to keep track of the index in the temporary array.
		3. Iterate through the input array:
			- If the current element is non-zero, assign it to the temporary array at index j and increment j.
		4. After the loop, copy the elements from the temporary array back to the original array.
		5. Return the modified array.
		6. The order of non-zero elements is preserved.
		7. The zeroes are moved to the end of the array.
	
		Time Complexity: O(n) - where n is the size of the array.
		Space Complexity: O(n) - for the temporary array.
	
	'''
	def pushZerosToEnd(self,arr):
		# code here
		n = len(arr)
		# Create a temporary array to store non-zero elements
		# Initialize the temporary array with zeroes
		tempArray = [0]*n
		# Initialize a variable to keep track of the index in the temporary array
		j=0
		# Iterate through the input array
		for i in range(n):
			# If the current element is non-zero, assign it to the temporary array at index j
			# and increment j
			if(arr[i]>0):
				tempArray[j]= arr[i]
				j+=1
		# After the loop, copy the elements from the temporary array back to the original array
		# The remaining elements in the temporary array will be zeroes
		for i in range(n):
			arr[i] = tempArray[i]


	'''
	'Function to push all zeroes to end of array without changing the order of non-zero elements.'
	
	Approach 2:
		1. Initialize a variable j to keep track of the index of the last non-zero element.
		2. Iterate through the input array:
			- If the current element is non-zero, swap it with the element at index j and increment j.
		3. After the loop, the non-zero elements will be at the beginning of the array, and the zeroes will be at the end.
		4. Return the modified array.
		5. The order of non-zero elements is preserved.
		6. The zeroes are moved to the end of the array.7. This approach is more efficient than the previous one as it uses constant space.
		8. The time complexity is the same as the previous approach.
		9. The space complexity is reduced to O(1) as no additional space is used.

		Time Complexity: O(n) - where n is the size of the array.
		Space Complexity: O(1) - no additional space is used.
	
	'''
	def push_zeros_to_end(self, arr):
		# code here
		n = len(arr)
		# Initialize a variable to keep track of the index of the last non-zero element
		j=0
		# Iterate through the input array
		for i in range(n):
			# If the current element is non-zero, swap it with the element at index j
			# and increment j
			if(arr[i]>0):
				temp= arr[i]
				arr[i]=arr[j]
				arr[j]=temp
				j+=1

Solution = Solution()
# Example Test Cases - Approach 1
print("Example Test Cases - Approach 1")
arr = [0, 1, 0, 3, 12]
print("Original array:", arr)
Solution.pushZerosToEnd(arr)
print("Array after pushing zeroes to end:", arr)
arr = [0, 0, 0, 0, 0]
print("Original array:", arr)
Solution.pushZerosToEnd(arr)
print("Array after pushing zeroes to end:", arr)

# Example Test Cases - Approach 2
print("Example Test Cases - Approach 2")
arr = [0, 1, 0, 3, 12]
print("Original array:", arr)
Solution.push_zeros_to_end(arr)
print("Array after pushing zeroes to end:", arr)
arr = [0, 0, 0, 0, 0]
print("Original array:", arr)
Solution.push_zeros_to_end(arr)
print("Array after pushing zeroes to end:", arr)

# Output
# Example Test Cases - Approach 1
# Original array: [0, 1, 0, 3, 12]
# Array after pushing zeroes to end: [1, 3, 12, 0, 0]
# Original array: [0, 0, 0, 0, 0]
# Array after pushing zeroes to end: [0, 0, 0, 0, 0]
# Example Test Cases - Approach 2
# Original array: [0, 1, 0, 3, 12]
# Array after pushing zeroes to end: [1, 3, 12, 0, 0]
# Original array: [0, 0, 0, 0, 0]
# Array after pushing zeroes to end: [0, 0, 0, 0, 0]
