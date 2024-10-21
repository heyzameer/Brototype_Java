package Collections.Maps;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> studentMarks = new HashMap<>();

        // Add key-value pairs
        studentMarks.put("Alice", 85);
        studentMarks.put("Bob", 92);
        studentMarks.put("Charlie", 78);

        // Print the map
        System.out.println("Student Marks: " + studentMarks);

        // Get the value associated with a key
        int aliceMarks = studentMarks.get("Alice");
        System.out.println("Marks of Alice: " + aliceMarks);  // Output: 85

        // Check if the map contains a key
        boolean hasBob = studentMarks.containsKey("Bob");
        System.out.println("Does the map contain Bob? " + hasBob);  // Output: true

        // Remove a key-value pair
        studentMarks.remove("Charlie");
        System.out.println("After removing Charlie: " + studentMarks);  // Output: {Alice=85, Bob=92}

        // Iterate over the map entries
        System.out.println("Iterating over map:");
        for (Map.Entry<String, Integer> entry : studentMarks.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
//A Map is a collection that stores key-value pairs. One commonly used implementation is HashMap, where keys must be unique.

//Common Methods of Map:
//put(key, value): Adds a key-value pair.
//get(key): Retrieves the value for a given key.
//remove(key): Removes the key-value pair for a given key.
//containsKey(key): Checks if the map contains a key.
//entrySet(): Returns a set of key-value pairs in the map for iteration.