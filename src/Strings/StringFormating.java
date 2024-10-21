
package Strings;
import java.util.Scanner;

public class StringFormating {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Ask user for their name
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            // Ask user for their age
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            // Format the output using String.format()
            String formattedString = String.format("Hello, my name is %s, and I am %d years old.", name, age);

            // Print the formatted string
            System.out.println(formattedString);

            // Close the scanner
            scanner.close();

    }

}


//It looks like you want a summary of the string formatting concepts in Java! Here's a concise overview based on your content:
//
//        ---
//
//        ### String Formatting in Java
//
//Java offers robust capabilities for formatting strings, allowing for the inclusion of variables in a structured format. The most common method for string formatting is `String.format()`.
//
//        #### 🔍 Basic Concept:
//        - **`String.format()`**: This method allows you to create formatted strings by embedding variable values inside a format string.
//
//        **Example**:
//        ```java
//int age = 25;
//String name = "Alice";
//String formattedString = String.format("Hello, my name is %s, and I am %d years old.", name, age);
//  System.out.println(formattedString);
//// Output: Hello, my name is Alice, and I am 25 years old.
//  ```
//
//          #### Common Format Specifiers:
//        - **`%s`**: String
//- **`%d`**: Integer
//- **`%f`**: Floating-point number
//- **`%t`**: Date/Time values
//- **`%n`**: Platform-specific line separator (newline)
//
//#### 💡 Key Points:
//        - `String.format()` creates a formatted string by embedding variable values into placeholders.
//        - Different format specifiers are used based on the type of variable (string, integer, float, etc.).
//        - The method returns a new formatted string without modifying the original string.
//
//#### 🔑 Quick Recap:
//        - `String.format()` is essential for embedding variables into strings.
//        - Use format specifiers like `%s` for strings, `%d` for integers, `%f` for floating-point numbers, and more.
//
//---
//
//If you need additional examples or want to dive deeper into any specific part, just let me know!