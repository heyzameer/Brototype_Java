package Arrays.Easy;

import java.util.Arrays;

public class ArrayDeletion {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = 5; // Current size of the array
        int position = 2; // Index of the element to delete

        // Shift elements to the left
        for (int i = position; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        // Optional: Clear the last element (not necessary if n is updated)
        arr[n - 1] = 0;
        n--;

        System.out.println("Array after deletion: " + Arrays.toString(arr));
    }
}
