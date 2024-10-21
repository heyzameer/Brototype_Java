package Methods;

public class MethodExample {

        // Method to add two integers
        public static int add(int a, int b) {
            return a + b;
        }

        // Method to concatenate two strings
        public static String concatenate(String str1, String str2) {
            return str1 + str2;
        }

        // Method to find the maximum of three numbers
        public static int findMax(int num1, int num2, int num3) {
            return Math.max(num1, Math.max(num2, num3));
        }

        // Method to print an array
        public static void printArray(int[] array) {
            System.out.print("Array elements: ");
            for (int element : array) {
                System.out.print(element + " ");
            }
            System.out.println(); // New line
        }

        // Main method to call other methods
        public static void main(String[] args) {
            // Calling the add method
            int sum = add(10, 20);
            System.out.println("Sum: " + sum); // Output: Sum: 30

            // Calling the concatenate method
            String result = concatenate("Hello, ", "World!");
            System.out.println("Concatenated String: " + result); // Output: Concatenated String: Hello, World!

            // Calling the findMax method
            int max = findMax(10, 20, 5);
            System.out.println("Maximum Value: " + max); // Output: Maximum Value: 20

            // Calling the printArray method
            int[] numbers = {1, 2, 3, 4, 5};
            printArray(numbers); // Output: Array elements: 1 2 3 4 5
        }
    }


