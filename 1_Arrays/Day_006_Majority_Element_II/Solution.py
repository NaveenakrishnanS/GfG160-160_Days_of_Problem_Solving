class Solution:

    '''
        Approach 1: Using HashMap/Dictionary
        Time Complexity: O(n) for traversing the array and O(nlogn) for sorting the result.
        Space Complexity: O(n) for storing the count of each element in the dictionary.
        
            Function to find the majority elements in the array
            The majority element is the element that appears more than n/3 times in the array.
            The function returns a list of all such elements in sorted order.

            The function uses a dictionary to count the occurrences of each element in the array.
            It then iterates through the dictionary to find elements that appear more than n/3 times.
            Finally, it sorts the result and returns it.
            The function handles the case where the input array is empty by returning an empty list.
            The function also handles the case where there are no majority elements by returning an empty list.
            The function uses a dictionary to store the count of each element in the array.
    '''
    def findMajority(self, arr):
        # Get the length of the array
        n = len(arr)
        # Initialize a dictionary to store the count of each element in the array
        result = {}
        # Initialize an empty list to store the majority elements
        majority = []
        # If the array is empty, return an empty list
        if(n == 0):
            return majority
        # Count the occurrences of each element in the array using a dictionary
        # The dictionary stores the element as the key and its count as the value
        # The dictionary is used to keep track of the count of each element in the array.
        for i in range(n):
            result[arr[i]] = (result.get(arr[i], 0) +1)
        # Iterate through the dictionary to find elements that appear more than n/3 times
        # The dictionary is used to find the majority elements in the array.
        for j in result:
            if(result[j] > (n//3)):
                majority.append(j)
        # Sort the result in ascending order before returning it
        # The result is sorted to ensure that the majority elements are returned in ascending order.
        return sorted(majority)

    ''' 
        Approach 2: Using Boyer-Moore’s Voting Algorithm
        Time Complexity: O(n) for traversing the array and O(1) for sorting the result.
        Space Complexity: O(1) for storing the count of each element in the hashmap.

            Function to find the majority elements in the array
            The majority element is the element that appears more than n/3 times in the array.
            The function returns a list of all such elements in sorted order.
            
            The function uses Boyer-Moore's Voting Algorithm to find the majority elements in the array.
            It maintains two candidates and their counts, and iterates through the array to find the majority elements.
            Finally, it checks the counts of the candidates to determine if they are majority elements.
            The function handles the case where the input array is empty by returning an empty list.
            The function also handles the case where there are no majority elements by returning an empty list.
            The function uses two variables to store the candidates and their counts.
    '''
    def findMajority(self, arr):
        # Get the length of the array
        n = len(arr)
        # Initialize an empty list to store the majority elements
        majority = []
        # If the array is empty, return an empty list
        # The function handles the case where the input array is empty by returning an empty list.
        if(n==0):
            return majority
        # Initialize two variables to store the candidates and their counts
        # The variables are used to keep track of the candidates and their counts.
        e1, e2 = -1, -1
        c1, c2 = 0, 0
        # Iterate through the array to find the majority elements
        # The loop iterates through the array to find the majority elements.
        for i in range(n):
            # The condition checks if the current element is equal to the first candidate.
            if(e1 == arr[i]):
                c1+=1
            # The condition checks if the current element is equal to the second candidate.
            elif(e2 == arr[i]):
                c2+=1
            # The condition checks if the first candidate count is zero and assigns the current element to the first candidate.
            # Increment the count of the first candidate.
            elif(c1==0):
                e1=arr[i]
                c1+=1
            # The condition checks if the second candidate count is zero and assigns the current element to the second candidate.
            # Increment the count of the second candidate.
            elif(c2==0):
                e2=arr[i]
                c2+=1
            # The condition checks if the current element is not equal to either candidate.
            # Decrement the counts of both candidates.
            else:
                c1-=1
                c2-=1
        # After the loop, we have two candidates e1 and e2.
        # We need to check if they are majority elements by counting their occurrences in the array.
        # The counts of the candidates are checked to determine if they are majority elements.
        # Initialize the counts of the candidates to zero
        c1, c2 = 0, 0
        # Count the occurrences of each candidate in the array
        # The loop iterates through the array to count the occurrences of each candidate.
        for i in arr:
            # The condition checks if the current element is equal to the first candidate and increments the count of the first candidate.
            if(e1==i):
                c1+=1
            # The condition checks if the current element is equal to the second candidate and increments the count of the second candidate.
            if(e2==i):
                c2+=1
        # Check if the counts of the candidates are greater than n/3 and add them to the majority list
        if(c1 > (n//3)):
            majority.append(e1)
        if((c2 > (n//3)) and (e1!=e2)):
            majority.append(e2)
        # Sort the result in ascending order before returning it
        # The result is sorted to ensure that the majority elements are returned in ascending order.
        return sorted(majority)
