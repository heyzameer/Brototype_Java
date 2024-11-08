package Algorithms;

import java.util.Scanner;

public class BSStringToArrayTopScore {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            // Ask the user for the number of participants
            int n = sc.nextInt();
            sc.nextLine(); // Consume the newline character

            // Create an array to hold the scores
            int[] scores = new int[n];

            // Ask the user to enter the scores
            String inputLine = sc.nextLine();
            String[] inputStrings = inputLine.trim().split("\\s+");

            // Convert the array of strings to an array of integers
            for (int i = 0; i < n; i++) {
                scores[i] = Integer.parseInt(inputStrings[i]);
            }

            // Call the method to find the maximum score and print the result
            int maxScore = findMaxScore(scores);
            System.out.println("The highest score is: " + maxScore);
            sc.close();
        }

        // Method to find the maximum score
        public static int findMaxScore(int[] scores) {
            // Initialize the first element as the maximum
            int max = scores[0];
            // Traverse through the array
            for (int i = 1; i < scores.length; i++) {
                if (scores[i] > max) {
                    max = scores[i];  // Update max if current element is greater
                }
            }
            return max; // Return the highest score found
        }
    }

