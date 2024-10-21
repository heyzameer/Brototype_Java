package Strings;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Read input from the user
            System.out.print("Enter a line of text: ");
            String userInput = scanner.nextLine();

            // Create a string using double quotes
            String str1 = userInput;
            String str2 = userInput;

            // Create a string using the new keyword
//            String str2 = new String(userInput);

            // Display both strings
            System.out.println("String created using double quotes: " + str1);
            System.out.println("String created using new keyword: " + str2);

            // Compare references using '=='
            boolean areReferencesEqual = (str1 == str2);
            System.out.println("Are the two strings equal by '=='? " + areReferencesEqual);

            // Compare contents using 'equals()'
            boolean areContentsEqual = str1.equals(str2);
            System.out.println("Are the two strings equal by 'equals()'? " + areContentsEqual);

            // Explanation:
            // When using double quotes, Java tries to reuse string literals from the string pool for memory efficiency.
            // When using the new keyword, a new object is created on the heap, even if the content is the same as an existing string.
            // Therefore, '==' compares the references and returns false, but 'equals()' compares the actual content and returns true.



            // Asking the user to input three strings
            System.out.println("Enter the first string:");
            String str4 = scanner.nextLine();

            System.out.println("Enter the second string:");
            String str5 = scanner.nextLine();

            System.out.println("Enter the third string:");
            String str3 = scanner.nextLine();

            // Using String (Immutable)
            String stringConcat = str4 + str5 + str3;
            System.out.println("Using String: " + stringConcat);

            // Using StringBuilder (Mutable, Not Thread-Safe, Fast)
            StringBuilder sb = new StringBuilder();
            sb.append(str4).append(str5).append(str3);
            System.out.println("Using StringBuilder: " + sb.toString());

            // Using StringBuffer (Mutable, Thread-Safe, Slower than StringBuilder)
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(str4).append(str5).append(str3);
            System.out.println("Using StringBuffer: " + stringBuffer.toString());
            scanner.close();
        }
    }


