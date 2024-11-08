package Algorithms;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
     public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // An array of sorted scores
            int[] scores = {11, 23, 34, 45, 56, 67, 78, 89, 90, 100};

            // Ask user to input the score they're searching for
            System.out.println("Enter the score you want to find: ");
            int target = sc.nextInt();

            // Call the binary search method and print the result
            int resultIndex = binarySearch(scores, target);

            if (resultIndex == -1) {
                System.out.println(target + " is not in the list.");
            } else {
                System.out.println(target + " is found at index " + resultIndex);
            }

            sc.close();
        }

        // Binary Search method
        public static int binarySearch(int[] array, int target) {
            int left = 0;
            int right = array.length - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                // Check if the target is at the mid
                if (array[mid] == target) {
                    return mid;
                }

                // If target is greater, ignore left half
                if (array[mid] < target) {
                    left = mid + 1;
                } else {
                    // If target is smaller, ignore right half
                    right = mid - 1;
                }
            }

            // If the element is not present
            return -1;
        }
    }
