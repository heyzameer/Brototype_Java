package Strings;

public class StringExample {
    public static void main(String[] args) {
        // 1. String Creation
        String str1 = "Hello";  // Using string literal (stored in String pool)
        String str2 = new String("Hello");  // Using new keyword (stored in heap)

        // 2. String Comparison
        System.out.println("str1 == str2: " + (str1 == str2));      // false (different objects)
        System.out.println("str1.equals(str2): " + str1.equals(str2)); // true (same content)

        // 3. String Immutability
        String original = "Java";
        String modified = original.concat(" Programming");
        System.out.println("Original String: " + original);   // Output: Java
        System.out.println("Modified String: " + modified);   // Output: Java Programming

        // 4. Common String Methods
        System.out.println(str1.indexOf("e"));
        System.out.println("Length of 'Hello': " + str1.length());     // 5
        System.out.println("Character at index 1: " + str1.charAt(1)); // 'e'
        System.out.println("Substring from index 2: " + str1.substring(2)); // "llo"
        System.out.println("Uppercase: " + str1.toUpperCase());        // "HELLO"
        System.out.println("Contains 'ell': " + str1.contains("ell")); // true
        System.out.println("Starts with 'He': " + str1.startsWith("He")); // true
        System.out.println("Replaced 'l' with 'p': " + str1.replace('l', 'p')); // Heppo

        // 5. StringBuilder (Mutable String)
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println("StringBuilder result: " + sb.toString());  // Output: Hello World

        // 6. Escape Characters
        String text = "Hello\nWorld\t\"Java\"";
        System.out.println("Escaped String: ");
        System.out.println(text);  // Output: Hello (new line) World (tab) "Java"
    }
}
