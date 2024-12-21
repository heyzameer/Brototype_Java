package Patterns.fumigation;

public class PyramidEmptySpace_1_Alpha {
    public static void main(String[] args) {
        int n = 5; // Number of rows (can be changed for generalization)

        for (int i = 1; i <= n; i++) { // Row loop
            char ch = 'A';
            for (int j = 1; j <= 2 * n - 1; j++) { // Column loop
                // Condition to print stars or spaces
                if (j <= n + 1 - i || j >= n - 1 + i) {
                    System.out.print(ch);

                } else {
                    System.out.print(" ");
                }

                if(j<=(2*n-1)/2){
                    ch++;
                }else {
                    ch--;
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
