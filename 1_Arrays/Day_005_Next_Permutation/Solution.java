class Solution {

    void nextPermutation(int[] arr) {
        // Sie of an array
        int n = arr.length;
        // Initialize pivot value to -1
        int pivot = -1;
        // Find Pivot index
        for(int i = (n-2); i>=0; i--){
            if(arr[i] < arr[i+1]){
                pivot = i;
                break;
            }
        }
        // If Pivot does not exist, reverse the whole array
        if(pivot == -1){
            reverseArray(arr);
            return;
        }
        // Find the element from the right that is greater than pivot
        for(int i = (n-1); i>pivot; i--){
            if(arr[i] > arr[pivot]){
                swapElements(arr, i, pivot);
                break;
            }
        }
        // Reverse the elements from pivot+1 to end
        reverse(arr, pivot+1, n-1);
    }
    
    // Function to reverse whole array
    void reverseArray(int[] arr){
        int n = arr.length;
        for(int i=0; i<(n/2); i++) {
            swapElements(arr, i, (n-i-1));
        }
    }

    // Function to reverse elements from start to end indices
    void reverse(int[] arr, int start, int end){
        while(start < end){
            swapElements(arr, start++, end--);
        }
    }

    // Function to swap th elements of p and q indices of an array(arr)
    void swapElements(int[] arr, int p, int q){
        int temp = arr[p];
        arr[p] = arr[q];
        arr[q] = temp;
    }
}