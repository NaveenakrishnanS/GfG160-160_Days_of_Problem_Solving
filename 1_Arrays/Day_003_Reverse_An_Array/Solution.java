import java.util.Scanner;

/**
 * * This class contains a method to reverse an array in place.
 * * The main method takes input from the user for the size and elements of the array,
 * * calls the reverseArray method, and prints the reversed array.
 * 
 * * The reverseArray method uses a two-pointer approach to swap elements from the start and end of the array.
 * * The time complexity of this function is O(n), where n is the size of the array.
 * * The space complexity is O(1) as it uses a constant amount of extra space.
 */
class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input the size of the array and the elements of the array
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt(); // size of the array
        int arr[] = new int[n]; // declare the array
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the element " + (i + 1) + ": ");
            arr[i] = sc.nextInt(); // input the array elements
        }
        sc.close(); // close the scanner
        Solution obj = new Solution(); // create an object of the class
        obj.reverseArray(arr); // call the reverseArray method
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " "); // print the reversed array
        }
        System.out.println(); // print a new line
        // Call the reverseArraySolTwo method to reverse the array using a different approach
        obj.reverseArraySolTwo(arr); // call the reverseArraySolTwo method
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " "); // print the reversed array
        }
        System.out.println(); // print a new line
    }


    // Function to reverse the array.
    /**
     * Approach 1:
     * * This function reverses the given array in place using a two-pointer approach.
     * * It takes an array as input and modifies it to be in reverse order.
     * * * The function uses a two-pointer approach to swap elements from the start and end of the array.
     * * The time complexity of this function is O(n), where n is the size of the array.
     * * The space complexity is O(1) as it uses a constant amount of extra space.
     * 
     * * @param arr: input array
     * * @return: reversed array
     */
    public void reverseArray(int arr[]) {
        int size = arr.length;
        int j = size-1;
        // Calculate the mid-point of the array and swap elements from the start and end of the array
        int mid = size/2;
        int temp = 0;
        // Swap elements from the start and end of the array until the mid-point is reached
        for (int i=0; i<size-1; i++){
            // If the index is less than the mid-point, swap the elements
            if(i<mid){
                // Swap the elements at index i and j
                // Store the value of arr[i] in a temporary variable
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            // Decrement j to move towards the start of the array
            j--;
        }
    }


    /**
     * * * This function reverses the given array in place using a different approach.
     * * * It takes an array as input and modifies it to be in reverse order.
     * * * This is the Optimal Approach since it uses a single loop with half the size of the array.
     * 
     *  Approach:
     *      1. Initialize a variable `size` to the length of the array.
     *      2. Initialize a variable `temp` to 0.
     *      3. Loop through the first half of the array using a for loop.
     *      4. Inside the loop, swap the elements at index `i` and `size-i-1` using a temporary variable `temp`.
     *      5. After the loop, the array will be reversed.
     *      6. Return the reversed array.
     *      7. The time complexity of this function is O(n), where n is the size of the array.
     *      8. The space complexity is O(1) as it uses a constant amount of extra space.
     * 
     * * @param arr: input array
     * * @return: reversed array
     */
    public void reverseArraySolTwo(int arr[]) {
        // code here
        // Initialize a variable `size` to the length of the array.
        int size = arr.length;
        // Initialize a variable `temp` to 0.
        int temp = 0;
        // Loop through the first half of the array using a for loop.
        // Inside the loop, swap the elements at index `i` and `size-i-1` using a temporary variable `temp`.
        for (int i=0; i<size/2; i++){
            // Swap the elements at index `i` and `size-i-1` using a temporary variable `temp`.
            // Store the value of arr[i] in a temporary variable
            temp = arr[i];
            arr[i] = arr[size-i-1];
            arr[size-i-1] = temp;
        }
    }
}