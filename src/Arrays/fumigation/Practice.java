package Arrays.fumigation;
public class Practice {
    public static void main(String[] args) {
        int n = 5; // Total number of rows in the pattern
        int mid = n - 1; // Middle point of the pattern

        // Loop for the rows
        for (int i = 0; i < n * 2 - 1; i++) {
            for (int j = 0; j < n; j++) {
                // Print spaces or stars based on the current row
                if (j < Math.abs(mid - i)) {
                    System.out.print(" "); // Replace `5` with space
                } else {
                    System.out.print("*"); // Replace `4` with star
                }
            }
            System.out.println(); // Move to the next row
        }
    }
}
