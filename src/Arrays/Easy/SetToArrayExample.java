package Arrays.Easy;

import java.util.HashSet;
import java.util.Set;

public class SetToArrayExample {
    public static void main(String[] args) {
        // Create a Set
        Set<String> fruitsSet = new HashSet<>();
        fruitsSet.add("Apple");
        fruitsSet.add("Banana");
        fruitsSet.add("Mango");
        fruitsSet.add("Orange");

        // Convert the Set to an Array
        String[] fruitsArray = fruitsSet.toArray(new String[0]);

        // Print the Array
        System.out.println("Array from Set:");
        for (String fruit : fruitsArray) {
            System.out.println(fruit);
        }
    }
}
