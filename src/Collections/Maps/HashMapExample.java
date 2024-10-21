package Collections.Maps;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, String> countryCapitals = new HashMap<>();

        // Add key-value pairs (Country, Capital)
        countryCapitals.put("India", "New Delhi");
        countryCapitals.put("USA", "Washington D.C.");
        countryCapitals.put("Japan", "Tokyo");

        // Print the HashMap
        System.out.println("Country-Capitals: " + countryCapitals);

        // Get the capital of a country
        String capitalOfIndia = countryCapitals.get("India");
        System.out.println("Capital of India: " + capitalOfIndia);  // Output: New Delhi

        // Check if a key exists
        boolean hasJapan = countryCapitals.containsKey("Japan");
        System.out.println("Does the map contain Japan? " + hasJapan);  // Output: true

        // Remove a key-value pair
        countryCapitals.remove("USA");
        System.out.println("After removing USA: " + countryCapitals);  // Output: {India=New Delhi, Japan=Tokyo}

        // Iterate over the HashMap
        System.out.println("Iterating over HashMap:");
        for (String country : countryCapitals.keySet()) {
            System.out.println(country + ": " + countryCapitals.get(country));
        }
    }
}
//3. HashMap in Java
//HashMap is an implementation of the Map interface that allows storing key-value pairs. It does not maintain order of insertion, and keys must be unique.
//
//Common Methods of HashMap:
//put(key, value): Adds or updates a key-value pair.
//get(key): Retrieves the value for a given key.
//remove(key): Removes a key-value pair by the key.
//containsKey(key): Checks if a key exists in the map.
//keySet(): Returns a set of all keys in the map.
//values(): Returns a collection of all values in the map.