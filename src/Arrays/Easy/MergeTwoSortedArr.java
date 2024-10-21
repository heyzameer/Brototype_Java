package Arrays.Easy;

import java.util.Arrays;

public class MergeTwoSortedArr {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 4, 5, 6};
        int[] array2 = {11, 31, 41, 51, 61};

        int size = (array1.length  + array2.length) ;
//        System.out.println(size);

        merge(array1, array2,size);
    }


    public static void merge(int[] array1, int[] array2,int size){
        int left = 0;
        int right = 0;

        int[] mergedArray = new int[size];
        int i = 0;
        while (left<= array1.length-1 && right <= array2.length-1){
            if (array1[left] > array2[right]){
                mergedArray[i++] = array2[right++];
            }
            else {
                mergedArray[i++] = array1[left++];
            }
        }

        while(left <= array1.length-1){
            mergedArray[i++] = array1[left++];
        }

        while(right <= array2.length-1){
            mergedArray[i++] = array2[right++];
        }

        System.out.println("Array 1 : "+ Arrays.toString(array1));
        System.out.println("Array 2 : "+ Arrays.toString(array2));
        System.out.println("Merged Sorted array : "+ Arrays.toString(mergedArray));
    }
}
