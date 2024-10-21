package Collections.Sets;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        // Create a HashSet
        Set<String> fruits = new HashSet<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Apple");  // Duplicate element, will be ignored

        // Print the set (no duplicates)
        System.out.println("Fruits Set: " + fruits);  // Output: [Apple, Banana, Mango]

        // Check if the set contains an element
        boolean hasMango = fruits.contains("Mango");
        System.out.println("Does the set contain Mango? " + hasMango);  // Output: true

        // Remove an element
        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);  // Output: [Apple, Mango]

        // Get the size of the set
        int setSize = fruits.size();
        System.out.println("Set size: " + setSize);  // Output: 2

        // Clear the set
        fruits.clear();
        System.out.println("Set after clear: " + fruits);  // Output: []
    }
}

//A Set is a collection that contains no duplicate elements. The most commonly used implementation of Set is HashSet.
//Common Methods of Set:
//add(element): Adds an element.
//remove(element): Removes an element.
//contains(element): Checks if an element is in the set.
//size(): Returns the number of elements in the set.
//clear(): Removes all elements from the set.
