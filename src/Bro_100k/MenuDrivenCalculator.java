package Bro_100k;


import java.util.Scanner;

class Calculator {
    // Method for addition
    public void addition(double num1, double num2) {
        System.out.println("Result: " + (num1 + num2));
    }

    // Method for subtraction
    public void subtraction(double num1, double num2) {
        System.out.println("Result: " + (num1 - num2));
    }

    // Method for multiplication
    public void multiplication(double num1, double num2) {
        System.out.println("Result: " + (num1 * num2));
    }

    // Method for division
    public void division(double num1, double num2) {
        if (num2 != 0) {
            System.out.println("Result: " + (num1 / num2));
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}

public class MenuDrivenCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (true) {
            // Display the menu
            System.out.println("\nMenu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            int choice = scanner.nextInt();

            // Check if user wants to exit
            if (choice == 5) {
                System.out.println("Exiting the program. Thank you!");
                break; // Exit the loop
            }

            // Get numbers from the user
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            // Perform the chosen operation
            switch (choice) {
                case 1:
                    calculator.addition(num1, num2);
                    break;
                case 2:
                    calculator.subtraction(num1, num2);
                    break;
                case 3:
                    calculator.multiplication(num1, num2);
                    break;
                case 4:
                    calculator.division(num1, num2);
                    break;
                default:
                    System.out.println("Invalid choice! Please select a valid option.");
            }
        }

        // Close the scanner
        scanner.close();
    }
}
