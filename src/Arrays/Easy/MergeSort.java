package Arrays.Easy;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {

        int[] array = {2, 4, 67, 1, 23, 65};
        int high = array.length - 1;
        int low = 0;

        mergeSort(array,low,high);

        System.out.println("Sorted Array: "+Arrays.toString(array));
    }

    public static void mergeSort(int[] array,int low, int high){
        if(low >= high)
            return;
        int mid = (low + high)/2;
        mergeSort(array,low,mid);
        mergeSort(array,mid+1,high);
        merge(array,low,mid,high);
    }

    public static void merge(int[] array,int low,int mid, int high) {
        ArrayList<Integer> tempArray = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        while (left <= mid && right <= high) {
            if (array[left] >= array[right]) {
                tempArray.add(array[right]);
                right++;
            } else {
                tempArray.add(array[left]);
                left++;
            }
        }

        while(left<= mid){
            tempArray.add(array[left]);
            left++;
        }
        while(right<= high){
            tempArray.add(array[right]);
            right++;
        }

        for (int i = low; i <= high; i++) {
            array[i] = tempArray.get(i - low);
        }
    }
}
