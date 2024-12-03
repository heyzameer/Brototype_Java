package Arrays.fumigation;

import java.util.Arrays;

public class ArrayInsertion {
    public static void main(String[] args) {
        int[] arr = new int[6]; // Array with extra space for insertion
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        int n = 5; // Current size of the array
        int position = 2; // Index where the new element will be inserted
        int element = 10; // Element to insert

        // Shift elements to the right
        for (int i = n; i > position; i--) {
            arr[i] = arr[i - 1];
        }

        // Insert the new element
        arr[position] = element;
        n++;

        System.out.println("Array after insertion: " + Arrays.toString(arr));
    }
}
