package Patterns.fumigation;

public class ArPr_1 {

        public static void main(String[] args) {
            int rows = 3; // Number of segments in the pattern

            for (int i = 1; i <= rows; i++) {
                int stars = i * 2; // Number of stars increases by 2 for each segment
                for (int j = 1; j <= stars; j++) {
                    System.out.print("* ");
                }
                System.out.println(); // Move to the next line

                // Print 3 rows of single stars after each segment
                if(i<rows){
                for (int k = 1; k <= i*3; k++) {
                    System.out.println("*");
                }
                }
            }

    }

}
