package Arrays.Easy;

import java.util.Arrays;

public class RightRotatebyK {
    public static void main(String[] args) {
        int[] array ={1,2,3,4,5,6};
        int k = 3;

        rotateNewPos(array,k);
    }

    public static void rotateNewPos(int[] array ,int k){
        int n = array.length;

        k = k % n;

        if(k<0){
            k = k + n; //Convert negative rotation to positive rotation
        } //This is because a left rotation by k is equivalent to a right rotation by size + k.

        int[] newArray = new int[n];
        for (int i = 0; i < n; i++) {
            int newPos = (i + k) % n;
            newArray[newPos] = array[i];
        }

        System.out.println("Array after "+k+" ratation "+ Arrays.toString(newArray));
    }
}
