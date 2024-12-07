package Patterns.fumigation;

public class ArPr_7 {
    public static void main(String[] args) {


        int n = 4; // Number of rows

        for (int i = 0; i < n; i++) {
            // Calculate the number of stars for left side and right side
            int stars = 2 * i + 1;
            if (i==3)
                break;
//            int spaces = 2 * (n - i); // Spaces in between

            // Print stars on the left
            for (int j = 0; j < stars; j++) {

                System.out.print("* ");
            }

            // Print spaces in between
            for (int j = 0; j <((2*5-1)-2*i)-2*i; j++) {
                System.out.print("  ");
            }

            // Print stars on the right
            for (int j = 0; j < stars; j++) {
                System.out.print("* ");
            }

            // Move to the next line after each row
            System.out.println();
        }
        System.out.print("* * * * * * * * * * * ");
    }
}