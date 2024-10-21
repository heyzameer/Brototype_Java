package Arrays.Easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class arrayToSet {
    public static void main(String[] args) {
        // Example array
        String[] fruitsArray = {"Apple", "Banana", "Mango", "Apple", "Orange"};

        // Convert array to a Set (removes duplicates)
        Set<String> fruitsSet = new HashSet<>(Arrays.asList(fruitsArray));

        // Print the Set
        System.out.println("Set from Array: " + fruitsSet);  // Output: [Apple, Orange, Banana, Mango]
    }
}

