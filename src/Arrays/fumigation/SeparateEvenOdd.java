package Arrays.fumigation;
public class SeparateEvenOdd {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        // Count evens and odds to create arrays of exact size
        int evenCount = 0, oddCount = 0;

        for (int num : array) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // Create arrays for even and odd numbers
        int[] evenArray = new int[evenCount];
        int[] oddArray = new int[oddCount];

        // Fill the even and odd arrays
        int evenIndex = 0, oddIndex = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                evenArray[evenIndex++] = num;
            } else {
                oddArray[oddIndex++] = num;
            }
        }

        // Print the even and odd arrays
        System.out.println("Even numbers:");
        for (int num : evenArray) {
            System.out.print(num + " ");
        }

        System.out.println("\nOdd numbers:");
        for (int num : oddArray) {
            System.out.print(num + " ");
        }
    }
}
