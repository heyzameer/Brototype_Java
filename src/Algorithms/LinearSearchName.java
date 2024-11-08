package Algorithms;

import java.util.Scanner;

public class LinearSearchName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Ask the user to input the names of students

        String[] students = sc.nextLine().split("\\s+");
        // Ask the user for the student's name they are searching for

        String targetName = sc.nextLine();
        // Call the search method and print the result
        String result = searchStudent(students, targetName);
        System.out.println(result);
        sc.close();
    }

    // Method to perform Linear Search
    public static String searchStudent(String[] students, String targetName) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].equalsIgnoreCase(targetName)) { // Case-insensitive comparison
                return targetName + " has completed the Java module and is found at position " + (i + 1) + ".";
            }
        }
        return targetName + " has not completed the module yet.";
    }
}
