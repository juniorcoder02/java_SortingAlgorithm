
import java.util.concurrent.CountDownLatch;

//Question : Use the following sorting algorithms to sort an array in DESCENDING order 
// a. Bubble Sort 
// b. Selection Sort 
// c. Insertion Sort 
// d. Counting Sort 
// You can use this array as an example : [3, 6, 2, 1, 8, 7, 4, 5, 3], 
public class assignmentQues {

    public static void bubbleSort(int arr[]) {
        boolean swap;
        for (int turn = 0; turn < arr.length - 1; turn++) {
            swap = false;

            for (int j = 0; j < arr.length - 1 - turn; j++) {

                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swap = true;

                }

            }
            if (!swap) {
                break;
            }
        }

    }

    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int maxPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[maxPos] < arr[j]) {
                    maxPos = j;
                }
            }
            if (maxPos != i) {
                int temp = arr[maxPos];
                arr[maxPos] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] < curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }
    }

    public static void countingSort(int arr[]) {
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }

        }
        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            count[j] = i;
            j++;
            count[i]--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3 };
        bubbleSort(arr);
        System.err.println("Sorted array using bubble sort");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        selectionSort(arr);
        System.err.println("Sorted array using selection sort");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        insertionSort(arr);
        System.err.println("Sorted array using insertion sort");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();


        countingSort(arr);
        System.err.println("Sorted array using counting sort");

        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

}
