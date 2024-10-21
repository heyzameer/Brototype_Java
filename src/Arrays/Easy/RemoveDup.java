package Arrays.Easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDup {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,1,2,3,4,5
        };

//        usingSet(array);
        usingSetGood(array);

//        countUnique(array);
    }

    // removes duplicate
    public static void usingSet(int[] array){
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < array.length; i++) {
            set.add(array[i]);
        }

        System.out.println(set);
    }

    public static void usingSetGood(int[] array){
        // Convert the Array to a Set of Integers
        Set<Integer> set = new HashSet<>();
        for (int num : array) {
            set.add(num);  // Adding each integer to the Set
        }

        // Convert the Set to an Array
        Integer[] numbersArray = set.toArray(new Integer[0]);

        // Print the Array
        System.out.println(Arrays.toString(numbersArray));
    }

    public static void countUnique(int[] array){
        int uniqueCount = 1;
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        for (int i = 1; i < array.length ;i++) {
            if (array[i - 1] != array[i]){
                uniqueCount ++;
            }
        }
        System.out.println("Number of unique elements : "+ uniqueCount);
    }

}
