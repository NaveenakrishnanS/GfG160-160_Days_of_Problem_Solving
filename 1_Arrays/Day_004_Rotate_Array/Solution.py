class Solution:
    #Function to rotate an array by d elements in counter-clockwise direction. 
    def rotateArr(self, arr, d):
        n = len(arr)
        if(d > len(arr)):
            d %= n
        
        # Solution 1
        def solutionOne(arr):
            temp = (arr[d:len(arr)] + arr[0:d])
            for i in range(n):
                arr[i] = temp[i]
                
        # Solution 2
        def solutionTwo(arr):
            reverseArray(arr,0,(d-1))
            reverseArray(arr,d,(n-1))
            reverseWholeArray(arr)
            
        # Reverse the elements of an array using start and end indices
        def reverseArray(arr,start,end):
            while(start < end):
                temp = arr[start]
                arr[start] = arr[end]
                arr[end] = temp
                start+=1
                end-=1
        
        # Reverse an array fully
        def reverseWholeArray(arr):
            n = len(arr)
            for i in range(n//2):
                temp=arr[i]
                arr[i]=arr[n-i-1]
                arr[n-i-1] = temp
            
        
        solutionTwo(arr)


#{ 
 # Driver Code Starts
#Initial Template for Python 3

import math


def main():
    T = int(input())

    while (T > 0):
        A = [int(x) for x in input().strip().split()]
        nd = [int(x) for x in input().strip().split()]
        D = nd[0]
        ob = Solution()
        ob.rotateArr(A, D)

        for i in A:
            print(i, end=" ")

        print()

        T -= 1

        print("~")


if __name__ == "__main__":
    main()
