package Strings;
import java.util.Scanner;

public class Reverse {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Ask user for input string
            System.out.println("Enter a string:");
            String inputString = scanner.nextLine();

            // Method 1: Using StringBuilder
            StringBuilder stringBuilder = new StringBuilder(inputString);
            String reversedWithStringBuilder = stringBuilder.reverse().toString();
            System.out.println("Reversed using StringBuilder: " + reversedWithStringBuilder);

            // Method 2: Using StringBuffer
            StringBuffer stringBuffer = new StringBuffer(inputString);
            String reversedWithStringBuffer = stringBuffer.reverse().toString();
            System.out.println("Reversed using StringBuffer: " + reversedWithStringBuffer);

            // Method 3: Using a normal string and a for loop
            String reversedWithLoop = "";
            for (int i = inputString.length() - 1; i >= 0; i--) {
                reversedWithLoop += inputString.charAt(i); // Append each character in reverse order
            }
            System.out.println("Reversed using for loop: " + reversedWithLoop);




            // Convert the string to a character array
            char[] charArray = inputString.toCharArray();

            // Initialize an empty string for the reversed result
            String reversed = "";

            // Reverse the character array
            for (int i = charArray.length - 1; i >= 0; i--) {
                reversed += charArray[i]; // Append characters in reverse order
            }

            // Print the original and reversed strings
            System.out.println("Original String: " + inputString);
            System.out.println("Reversed String: " + reversed);
            // Close the scanner
            scanner.close();
        }
    }


