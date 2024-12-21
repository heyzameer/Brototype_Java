package Arrays.fumigation;
import java.util.Arrays;
public class ZerosToStart {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 0, 3, 4, 0, 5}; // Input array
        moveZerosToStart(arr);
        System.out.println("Array after moving zeros to the start: " + Arrays.toString(arr));
    }


    static void moveZerosToStart(int[] arr) {
        int n = arr.length;

        // Create a temporary array to store non-zero elements in their original order
        int[] temp = new int[n];
        int index = 0; // Start filling temp from the end for zeros

        // Move zeros to the beginning of the temp array
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                temp[index++] = 0;
            }
        }

        // Move the non-zero elements to the remaining positions

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                temp[index++] = arr[i];
            }
        }

        // Copy the temp array back to the original array
        System.arraycopy(temp, 0, arr, 0, n);
    }
}