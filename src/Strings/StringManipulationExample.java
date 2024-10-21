package Strings;

public class StringManipulationExample {
    public static void main(String[] args) {
        // Sample strings
        String str1 = "Hello";
        String str2 = "World";

        // Concatenation using + operator
        String result1 = str1 + ", " + str2 + "!";
        System.out.println("Concatenated using +: " + result1); // "Hello, World!"

        // Concatenation using concat() method
        String result2 = str1.concat(", ").concat(str2).concat("!");
        System.out.println("Concatenated using concat(): " + result2); // "Hello, World!"

        // Concatenation using StringBuilder
        StringBuilder sb = new StringBuilder();
        sb.append(str1).append(", ").append(str2).append("!");
        String result3 = sb.toString();
        System.out.println("Concatenated using StringBuilder: " + result3); // "Hello, World!"

        // Concatenation using String.join()
        String result4 = String.join(", ", str1, str2) + "!";
        System.out.println("Concatenated using String.join(): " + result4); // "Hello, World!"

        // Concatenation using String.format()
        String result5 = String.format("%s, %s!", str1, str2);
        System.out.println("Concatenated using String.format(): " + result5); // "Hello, World!"

        // Other string methods demonstration
        System.out.println("Original String: " + result1); // "Hello, World!"
        System.out.println("Length: " + result1.length()); // 13
        System.out.println("Substring (7, 12): " + result1.substring(7, 12)); // "World"
        System.out.println("Char at index 1: " + result1.charAt(1)); // 'e'
        System.out.println("Uppercase: " + result1.toUpperCase()); // "HELLO, WORLD!"
        System.out.println("Trimmed: '" + result1.trim() + "'"); // "Hello, World!"
        System.out.println("Replaced 'o' with '0': " + result1.replace('o', '0')); // "Hell0, W0rld!"
    }
}
