package Arrays.fumigation;

import java.util.Scanner;


public class Prime {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Prompt the user to enter a number
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            // Check if the number is prime
            if (isPrime(number)) {
                System.out.println("Entered number is a Prime number.");
            } else {
                System.out.println("Entered number is not a Prime number.");
            }

            // Close the scanner
            scanner.close();
        }
        // Method to check if a number is prime
        public static boolean isPrime(int num) {
            // Handle edge cases
            if (num <= 1) {
                return false; // 0 and 1 are not prime numbers
            }
            if (num == 2) {
                return true; // 2 is the only even prime number
            }
            if (num % 2 == 0) {
                return false; // Exclude all other even numbers
            }

            // Check for factors from 3 to the square root of num
            for (int i = 3; i * i <= num; i += 2) {
                if (num % i == 0) {
                    return false; // Found a factor, not prime
                }
            }
            //If a number is not divisible by 2, there is no point in checking other even numbers (4, 6, 8, ...), because they are all multiples of 2 and can't divide the number without a remainder.
            return true; // No factors found, it's prime
        }
    }
