class Solution:
    
    def nextPermutation(self, arr):
        n = len(arr)
        pivot = -1
        # Find pivot index
        for i in range((n-2), -1,-1):
            if(arr[i] < arr[i+1]):
                pivot = i
                break
        # If Pivot does not exist, reverse the whole array
        if(pivot == -1):
            for i in range(n//2):
                temp = arr[i]
                arr[i] = arr[n-i-1]
                arr[n-i-1] = temp
            return
        # Find the element from the right that is greater than pivot
        for i in range((n-1), pivot, -1):
            if(arr[i] > arr[pivot]):
                arr[i], arr[pivot] = arr[pivot], arr[i]
                break
        # Reverse the elements from pivot+1 to end
        left, right = (pivot+1), (n-1)
        while left < right:
            arr[left], arr[right] = arr[right], arr[left]
            left += 1
            right -= 1
