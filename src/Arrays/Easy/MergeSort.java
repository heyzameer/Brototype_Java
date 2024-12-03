package Arrays.Easy;


import java.util.*;

class MyProgram {
    // Merge function to merge two sorted halves
    public static void merge(int[] arr, int low, int mid, int high) {
        // Create a temporary array to store merged elements
        int[] temp = new int[high - low + 1];
        int left = low;      // Starting index of left half
        int right = mid + 1; // Starting index of right half
        int k = 0;           // Index for temp array

        // Merge the two halves into the temp array
        while (left <= mid && right <= high) {
            if (arr[left] >= arr[right]) {
                temp[k++] = arr[left++];
            } else {
                temp[k++] = arr[right++];
            }
        }

        // Copy remaining elements from the left half
        while (left <= mid) {
            temp[k++] = arr[left++];
        }

        // Copy remaining elements from the right half
        while (right <= high) {
            temp[k++] = arr[right++];
        }

        // Copy the sorted elements back into the original array
        for (int i = 0; i < temp.length; i++) {
            arr[low + i] = temp[i];
        }
    }

    // Merge Sort function to recursively divide and merge
    public static void mergeSort(int[] arr, int low, int high) {
        if (low >= high) return;
        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);       // Sort left half
        mergeSort(arr, mid + 1, high); // Sort right half
        merge(arr, low, mid, high);    // Merge sorted halves
    }

    public static void main(String[] args) {
        // Sample input array
        int[] arr = {9, 4, 7, 6, 3, 1, 5};
        int n = arr.length;

        // Print the array before sorting
        System.out.println("Before sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Call mergeSort
        mergeSort(arr, 0, n - 1);

        // Print the array after sorting
        System.out.println("After sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

