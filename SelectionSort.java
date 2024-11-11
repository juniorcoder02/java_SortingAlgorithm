public class SelectionSort {

    /**
     * Algorithm for Selection Sort:
     * 1. Iterate over the array from the first element to the second last element (index 0 to n-2).
     * 2. For each position i, assume the element at position i is the minimum.
     * 3. Compare this element with the rest of the elements in the unsorted part of the array (i+1 to n-1).
     * 4. If a smaller element is found, update the position of the minimum element (minPos).
     * 5. After finding the minimum element in the unsorted part, swap it with the element at position i.
     * 6. Repeat steps 2-5 for all elements in the array, excluding the last element which is already sorted.
     * 7. The array is now sorted.
     */
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i; // Assume the first element of the unsorted part is the minimum.
            
            for (int j = i + 1; j < arr.length; j++) {
                // Find the minimum element in the unsorted part of the array.
                if (arr[minPos] > arr[j]) {
                    minPos = j; // Update the position of the minimum element.
                }
            }
            
            // Swap the found minimum element with the first element of the unsorted part.
            if (minPos != i) { // Only swap if minPos is not equal to i, to avoid unnecessary swaps.
                int temp = arr[minPos];
                arr[minPos] = arr[i];
                arr[i] = temp;
            }
        }
    }

    // Method to print the elements of the array.
    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " "); // Print each element followed by a space.
        }
        System.out.println(); // Print a newline after all elements are printed.
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 5, 3, 2 }; // Initialize an unsorted array.
        selectionSort(arr); // Sort the array using Selection Sort.
        printArray(arr); // Print the sorted array.
    }
}
 