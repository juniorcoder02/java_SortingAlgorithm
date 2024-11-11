public class CountingSort {
    public static void countSort(int arr[]) {
        if (arr.length == 0) return; // Handle empty array case

        // Find the largest element and calculate frequencies in one loop
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        // Create and populate count array in one go
        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        

        // Sort and place the elements back in the original array
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printArr(int arr[]) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {5,6,7,3,2,4,5,6,8,};
        countSort(arr);
        printArr(arr);
    }
}
