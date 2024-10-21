package Arrays.Easy;

import java.util.Scanner;
import java.util.Arrays;

public class SumEvenNum {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Ask user for the size of the array
            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();
            int[] array = new int[size];

            // Populate the array with user-input values
            System.out.println("Enter " + size + " integers:");
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }

            // Calculate the sum of all even numbers in the array
            int sumOfEvens = 0;
            for (int num : array) {
                if (num % 2 == 0) {
                    sumOfEvens += num;
                }
            }

            // Print the original array and the sum of even numbers
            System.out.println("Array: " + Arrays.toString(array));
            System.out.println("Sum of even numbers: " + sumOfEvens);

            scanner.close();
        }
    }

