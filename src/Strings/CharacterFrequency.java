package Strings;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        // Create a scanner to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Create a LinkedHashMap to store character frequencies and maintain insertion order
        LinkedHashMap<Character, Integer> charCountMap = new LinkedHashMap<>();

        // Loop through the string to count character frequencies
        for (char c : inputString.toCharArray()) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }

        // Print the character frequencies in insertion order
        System.out.println("Character Frequencies:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
