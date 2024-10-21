package Collections.ArrayList;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> names = new ArrayList<>();

        // Add elements
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Print the ArrayList
        System.out.println("Initial List: " + names);

        // Update an element
        names.set(1, "David");  // Changing "Bob" to "David"
        System.out.println("After Update: " + names);

        // Remove an element by value
        names.remove("Charlie");
        System.out.println("After Removing Charlie: " + names);

        // Check if the ArrayList contains "Alice"
        System.out.println("Contains Alice: " + names.contains("Alice"));

        // Iterating through the ArrayList
        System.out.println("Iterating:");
        for (String name : names) {
            System.out.println(name);

        }

        String item = names.get(1);  // Returns "Apple"
        System.out.println(item);

        int size = names.size();  // Returns "Apple"
        System.out.println(size);

        boolean isEmpty = names.isEmpty();
        System.out.println(isEmpty);

        boolean containsApple = names.contains("Apple");  // Returns true if "Apple" is in the lis
        System.out.println(containsApple);


        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(33);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(34);
        myNumbers.add(8);
        myNumbers.add(12);

        Collections.sort(myNumbers);  // Sort myNumbers

        for (int i : myNumbers)
            System.out.println(i);

    }
}
