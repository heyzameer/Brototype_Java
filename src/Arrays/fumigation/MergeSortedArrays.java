package Arrays.fumigation;
import java.util.Arrays;
public class MergeSortedArrays {
    public static void main(String[] args) {
    int[] ar1 = {1, 3, 5, 7};
    int[] ar2 = {2, 4, 6, 8};
    mergeArr(ar1, ar2);
}

public static void mergeArr(int[] ar1, int[] ar2) {
    int n = ar1.length;
    int m = ar2.length;

    int[] mergedArray = new int[m + n]; // Create a new array to store merged elements
    int i = 0; // Pointer for mergedArray
    int left = 0; // Pointer for ar1
    int right = 0; // Pointer for ar2

    // Merge the two arrays in sorted order
    while (left < n && right < m) {
        if (ar1[left] < ar2[right]) {
            mergedArray[i++] = ar1[left++];
        } else {
            mergedArray[i++] = ar2[right++];
        }
    }

    // Add remaining elements from ar1 (if any)
    while (left < n) {
        mergedArray[i++] = ar1[left++];
    }

    // Add remaining elements from ar2 (if any)
    while (right < m) {
        mergedArray[i++] = ar2[right++];
    }

    // Print the merged array
    System.out.println(Arrays.toString(mergedArray));
}
}
