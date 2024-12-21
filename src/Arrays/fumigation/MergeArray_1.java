package Arrays.fumigation;
import java.util.Arrays;
public class MergeArray_1 {
    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] mergedArray = new int[n1 + n2]; // Create a new array

        // Copy elements from the first array
        for (int i = 0; i < n1; i++) {
            mergedArray[i] = arr1[i];
        }

        // Copy elements from the second array
        for (int i = 0; i < n2; i++) {
            mergedArray[n1 + i] = arr2[i];
        }

        return mergedArray;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6, 8};

        int[] result = mergeArrays(arr1, arr2);
        System.out.println("Merged Array: " + Arrays.toString(result));
    }
}
