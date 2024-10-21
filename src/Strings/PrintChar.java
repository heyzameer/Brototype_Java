package Strings;
import java.util.Scanner;

public class PrintChar {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Ask the user to input a string
            System.out.println("Enter a string:");
            String inputString = scanner.nextLine();

            // Print each character of the string on a new line
            for (int i = 0; i < inputString.length(); i++) {
                char currentChar = inputString.charAt(i);
                System.out.println(currentChar);
            }

            // Close the scanner
            scanner.close();
        }


}
