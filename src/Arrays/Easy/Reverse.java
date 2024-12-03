package Arrays.Easy;
import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        int[] array = {23,65,23,665,89,1};

        int left = 0;
        int right = array.length-1;

        while(left < right){
            int temp = array[left];
            array[left++] = array[right];
            array[right--] = temp;
        }

        System.out.println(Arrays.toString(array));
    }
}
