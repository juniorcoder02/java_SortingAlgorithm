public class BubbleSort {

    /**
     * Algorithm for Bubble Sort:
     * 1. Iterate over the array multiple times, up to n-1 passes.
     * 2. During each pass, compare adjacent elements (from the beginning of the array to the end of the unsorted part).
     * 3. If the current element is greater than the next element, swap them to move the larger element towards the end.
     * 4. Repeat step 2 for each pair of adjacent elements in the array, reducing the number of comparisons with each pass.
     * 5. If no swaps occur during a pass, the array is already sorted, and you can stop early.
     * 6. Continue until the entire array is sorted.
     */
    public static void bubbleSort(int[] arr) {
        
        for (int turn = 0; turn < arr.length - 1; turn++) {
            int swapped=0;  // No swaps at the beginning of each pass
            
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                // Compare adjacent elements
                if (arr[j] > arr[j + 1]) {
                    // Swap elements if they are in the wrong order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    
                    swapped = 1; // Set swapped to true since a swap occurred
                }
            }
            
            // If no swaps occurred during the pass, array is sorted, so break early
            if (swapped==0) {
                break;
            }
        }
    }
    
    // Method to print the elements of the array
    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " "); // Print each element followed by a space
        }
        System.out.println(); // Print a newline after all elements
    }
    
    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 }; // Initialize the array with unsorted integers
        bubbleSort(arr); // Call bubbleSort to sort the array
        printArray(arr); // Call printArray to display the sorted array
    }
}
