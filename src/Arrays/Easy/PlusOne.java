package Arrays.Easy;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] array = {9,9,9,9,9,1};

        plusOne(array);

    }

    public static void plusOne(int[] array){
        int n = array.length;

        for (int i = n-1; i >=0 ; i--) {
            if(array[i]<9){
                array[i]++;
                break;
            }
            array[i] = 0;
        }
        System.out.println("Array afteer plus one "+ Arrays.toString(array));

    }
}
