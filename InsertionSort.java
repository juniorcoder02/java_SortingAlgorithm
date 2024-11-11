public class InsertionSort {

    /**
     * Optimized Insertion Sort with Algorithm Comments:
     * 1. Start with the second element (index 1) as the first element is considered sorted.
     * 2. For each element from index 1 to n-1, store the current element in a variable 'curr'.
     * 3. Compare 'curr' with elements in the sorted part of the array (from right to left).
     * 4. Shift elements in the sorted part one position to the right until the correct position for 'curr' is found.
     * 5. Insert 'curr' at its correct position in the sorted part.
     * 6. Repeat until all elements are sorted.
     */
    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i]; // Store the current element to be positioned.
            int prev = i - 1; // Initialize 'prev' to the last index of the sorted part.
kk
            // Shift elements to the right to make space for 'curr'.
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev]; // Move elements greater than 'curr' one position to the right.
                prev--; // Move left in the sorted part.
            }

            arr[prev + 1] = curr; // Insert 'curr' into its correct position.
        }
    }

    // Method to print the elements of the array.
    public static void printArr(int arr[]) {
        for (int element : arr) {
            System.out.print(element + " "); // Print each element followed by a space.
        }
        System.out.println(); // Print a new line for better readability.
    }

    public static void main(String[] args) {
        int arr[] = { 1, 5, 4, 3, 2 }; // Initialize an unsorted array.
        insertionSort(arr); // Call 'insertionSort' to sort the array.
        printArr(arr); // Call 'printArr' to display the sorted array.
    }
}
