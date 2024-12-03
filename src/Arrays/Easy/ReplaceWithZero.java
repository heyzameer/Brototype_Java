package Arrays.Easy;
import java.util.*;
public class ReplaceWithZero {
    public static void main(String[] args) {
        int[] array = {1,-2,5,-6,8};
        for (int i = 0; i < array.length; i++) {
            if(array[i] < 0){
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
