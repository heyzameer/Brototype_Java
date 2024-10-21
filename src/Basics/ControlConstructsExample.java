package Basics;
public class ControlConstructsExample {
    public static void main(String[] args) {
        // Conditional Statements
        int number = -5;
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        // Switch Statement
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day");
        }

        // Looping Statements
        System.out.println("For Loop:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration " + i);
        }

        System.out.println("While Loop:");
        int j = 0;
        while (j < 5) {
            System.out.println("Iteration " + j);
            j++;
        }

        System.out.println("Do-While Loop:");
        int k = 0;
        do {
            System.out.println("Iteration " + k);
            k++;
        } while (k < 5);

        // Branching Statements
        System.out.println("Break Example:");
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break; // Exit the loop when i is 5
            }
            System.out.println("i = " + i);
        }

        System.out.println("Continue Example:");
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue; // Skip the even numbers
            }
            System.out.println("i = " + i);
        }

        String[] fruits = {"Apple", "Banana", "Cherry", "Date"};

        System.out.println("Fruits in the array:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}

