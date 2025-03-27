class Solution {

    /**
     * 
     * Approach:
     *  1. Initialize two variables to store the largest and second largest elements.
     *  2. Iterate through the array.
     *  3. If the current element is greater than the largest element, update the second largest element to the previous largest element and update the largest element to the current element.
     *  4. If the current element is smaller than the largest element but greater than the second largest element, update the second largest element to the current element.
     *  5. Return the second largest element.
     * 
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */

    /**
     * Main method
     * @param args
     */

    public static void main(String[] args) {
        // Sample test array
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        
        // Call the method to find the second largest element
        int result = getSecondLargest(arr);
        
        // Print the result
        System.out.println("Second largest element is: " + result);
    }

    /**
     * Method to find the second largest element in the array
     * @param arr - int array
     * @return - int - second largest element of the array given 
     */
    private static int getSecondLargest(int[] arr) {
        // Initialize variables to store the largest and second largest elements
        int largest = -1;
        int secondLargest = -1;
        
        // Iterate through the array
        for (int i = 0; i < arr.length; i++) {
            
            // If the current element is greater than the largest
            if (arr[i] > largest) {
                // Update secondLargest to the previous largest
                secondLargest = largest;
                // Update largest to the current element
                largest = arr[i];
            }
            // If the current element is smaller than the largest but greater than secondLargest
            else if ((arr[i] < largest) && (arr[i] > secondLargest)) {
                // Update secondLargest to the current element
                secondLargest = arr[i];
            }
        }
        
        // Return the second largest element
        return secondLargest;
    }
}