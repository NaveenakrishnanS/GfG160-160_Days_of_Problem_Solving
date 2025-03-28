class Solution {

    public static void main(String[] args) {
        // Sample test array
        int[] arr = {0, 1, 0, 3, 12};
        System.out.println("Approach 1: ");
        // Print the original array
        System.out.print("Original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        // Call the method to move zeroes to the end
        pushZerosToEnd(arr);
        // Print the modified array
        System.out.print("Array after moving zeroes to the end: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Sample test array for optimized method
        int[] arr2 = {0, 1, 0, 3, 12};
        System.out.println("Approach 2: ");
        // Print the original array
        System.out.print("Original array: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        // Call the optimized method to move zeroes to the end
        pushZerosToEndSolTwo(arr2);
        // Print the modified array
        System.out.print("Optimized array after moving zeroes to the end: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
    }

    /**
     *  Approach:
     *      1. Create a temporary array of the same size as the input array.
     *      2. Traverse the input array and copy all non-zero elements to the temporary array.
     *      3. After copying all non-zero elements, fill the remaining positions in the temporary array with zeroes.
     *      4. Copy the elements from the temporary array back to the input array.
     *      5. This approach maintains the relative order of non-zero elements.
     */

    /**
     * Moves all zeroes in the input array to the end while maintaining the 
     * relative order of non-zero elements. This approach uses a temporary 
     * array to store non-zero elements and then copies them back to the 
     * original array.
     * 
     *   - Moves all zeroes to the end using a temporary array.
     *   - Maintains the relative order of non-zero elements.
     * 
     * Time Complexity: O(N) - The array is traversed twice.
     * Space Complexity: O(N) - A temporary array of the same size is used.
     * 
     * @param arr The input array to be modified in-place.
     */
    static void pushZerosToEnd(int[] arr) {
        // code here
        int size = arr.length;
        // Create a temporary array to store non-zero elements and fill it with zeroes.
        // The temporary array will be used to store the non-zero elements.
        // The size of the temporary array is the same as the input array and filled with zeroes.
        int[] tempArray = new int[size];
        int j = 0;
        // Traverse the input array and copy all non-zero elements to the temporary array.
        for(int i=0;i < size;i++){
            // If the current element is non-zero, copy it to the temporary array.
            // The index j is used to keep track of the position in the temporary array.
            if(arr[i]>0){
                // Copy the non-zero element to the temporary array.
                tempArray[j]=arr[i];
                // Increment the index j to point to the next position in the temporary array.
                // This ensures that the non-zero elements are copied in the same order as they appear in the input array.
                j++;
            }
        }
        // After copying all non-zero elements, fill the remaining positions in the temporary array with zeroes.
        // The remaining positions in the temporary array are filled with zeroes.
        for(int i=0;i < size;i++){
            arr[i] = tempArray[i];
        }
    }

    /**
     *  Optimized Approach:
     *      1. Use two pointers to traverse the array.
     *      2. The first pointer (i) is used to traverse the array and the second pointer (j) is used to keep track of the position where the next non-zero element should be placed.
     *      3. If the current element is non-zero, swap it with the element at position j and increment j.
     *      4. After traversing the array, all non-zero elements will be at the beginning of the array and j will point to the first zero position.
     *      5. Fill the remaining positions in the array with zeroes.
     *      6. The time complexity is O(N) and space complexity is O(1) as we are not using any extra space.
     *      7. This approach also maintains the relative order of non-zero elements.
    */

    /**
     * Optimized solution to move all zeroes in the input array to the end 
     * while maintaining the relative order of non-zero elements. This 
     * approach uses two pointers to modify the array in-place without 
     * requiring extra space.
     * 
     *   - Optimized in-place solution using two pointers.
     *   - Moves all zeroes to the end without using extra space.
     *   - Maintains the relative order of non-zero elements.
     * 
     * Time Complexity: O(N) - The array is traversed once.
     * Space Complexity: O(1) - No extra space is used.
     * 
     * @param arr The input array to be modified in-place.
     * @return The modified array with all zeroes moved to the end.
     */
    static void pushZerosToEndSolTwo(int[] arr) {
        // code here
        int size = arr.length;
        // Initialize a variable to keep track of the position where the next non-zero element should be placed.
        int temp = 0;
        // Initialize a pointer j to keep track of the position where the next non-zero element should be placed.
        int j = 0;
        // Traverse the array using the first pointer i.
        for(int i=0;i < size;i++){
            // If the current element is non-zero, swap it with the element at position j.
            // Increment j to point to the next position where the next non-zero element should be placed.
            if(arr[i]>0){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }
}