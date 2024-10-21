package Arrays.Easy;

import java.util.ArrayList;
import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
//        ArrayList<Integer> number = new ArrayList<>(Arrays.asList(2,6,1,4,3));
        int[] array = {111, 23, 4, 5, 56};
        int low = 0;
//        int high = number.size() - 1;
        int high = array.length - 1;
        mergeSort(array,low,high);
        System.out.println(Arrays.toString(array));
    }

    public static void mergeSort(int[] list, int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = (low + high) / 2;
        mergeSort(list, low, mid);
        mergeSort(list, mid + 1, high);
        merge(list, low, mid, high);
    }

  public static void merge(int[] list, int low, int mid, int high) {
        ArrayList<Integer> tempNum = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        while (left <= mid && right <= high) {
            if (list[left] > list[right]) {
                tempNum.add(list[right]);
                right++;
            } else {
                tempNum.add(list[left]);
                left++;
            }
        }
        while (left <= mid) {
            tempNum.add(list[left]);
            left++;
        }
        while (right <= high) {
            tempNum.add(list[right]);
            right++;
        }

        for (int i = low; i <= high; i++) {
            list[i] = tempNum.get(i - low);
        }
    }
}


