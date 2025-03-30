class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        // add your code here
        int n = arr.length;
        if(d > n){
            d = d%n;
        }
        reverseArray(arr,0,d-1);
        reverseArray(arr,d,n-1);
        reverseWholeArray(arr);
        
    }

    // Function to reverse the elements of an array using start and end indices
    static void reverseArray(int[] arr, int start, int end){
        int temp;
        while(start < end){
            temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    // Function to reverse an array fully
    static void reverseWholeArray(int arr[]){
        int temp;
        int size = arr.length;
        int mid = size/2;
        for(int i=0;i< mid;i++){
            temp=arr[i];
            arr[i]=arr[size-i-1];
            arr[size-i-1]=temp;
        }
    }
}