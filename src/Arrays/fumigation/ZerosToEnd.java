package Arrays.fumigation;

import java.util.Arrays;

public class ZerosToEnd {
    public static void main(String[] args) {
        int[] array ={1,0,2,0,3,0,5,6};

        zeroToEnd(array);
        System.out.println(Arrays.toString(array));
    }

    static void zeroToEnd(int[] array){
        int temp[] = new int[array.length];
        int index =0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                temp[index++] = array[i];
            }
        }
        for (int i = index; i < array.length; i++) {
            temp[i]=0;
        }
        System.out.println(Arrays.toString(temp));
        System.arraycopy(temp,0,array,0, array.length);
    }
}
