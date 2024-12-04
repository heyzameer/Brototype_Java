package Arrays.fumigation;

import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};
        int[] mergedArr = new int[arr1.length + arr2.length];

        // Merge the two arrays into one
        for (int i = 0; i < arr1.length; i++) {
            mergedArr[i] = arr1[i];
            mergedArr[i + arr1.length] = arr2[i];
        }

        // Print the merged array
        System.out.println(Arrays.toString(mergedArr));
    }
}
