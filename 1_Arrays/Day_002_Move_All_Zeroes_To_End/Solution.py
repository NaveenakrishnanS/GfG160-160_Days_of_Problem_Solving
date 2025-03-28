class Solution:
	def pushZerosToEnd(self,arr):
		# code here
		n = len(arr)
		tempArray = [0]*n
		j=0
		for i in range(n):
			if(arr[i]>0):
				tempArray[j]= arr[i]
				j+=1
		
		for i in range(n):
			arr[i] = tempArray[i]