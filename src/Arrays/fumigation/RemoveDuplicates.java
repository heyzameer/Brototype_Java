package Arrays.fumigation;

public class RemoveDuplicates {
        public static void main(String[] args) {
            int[] arr = {1, 2, 2, 3, 4, 4, 5}; // Input array
            int n = arr.length;

            // Array to store unique elements
            int[] unique = new int[n];
            int uniqueIndex = 0;

            for (int i = 0; i < n; i++) {
                boolean isDuplicate = false;

                // Check if the current element exists earlier in the result array
                for (int j = 0; j < uniqueIndex; j++) {
                    if (arr[i] == unique[j]) {
                        isDuplicate = true;
                        break;
                    }
                }

                // If it's not a duplicate, add it to the result array
                if (!isDuplicate) {
                    unique[uniqueIndex++] = arr[i];
                }
            }

            // Print the unique elements
            System.out.print("Array after removing duplicates: ");
            for (int i = 0; i < uniqueIndex; i++) {
                System.out.print(unique[i] + " ");
            }
        }
    }
