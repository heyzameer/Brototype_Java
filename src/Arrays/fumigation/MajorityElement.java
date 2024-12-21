package Arrays.fumigation;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {1, 3, 3, 3, 1};
        int n = arr.length;
        int[] freq = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            // If already counted, skip
            if (freq[i] != 0) {
                continue;
            }

            // Count occurrences of arr[i]
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    freq[j] = -1; // Mark as counted
                    count++;
                }
            }

            // Store frequency in the current index
            freq[i] = count;
        }

        // Print results
        for (int i = 0; i < arr.length; i++) {
            if (freq[i] >n/2) {
                System.out.println("Element " + arr[i] + " occurs " + freq[i] + " times");
                return;
            }
        }
        System.out.println("no majority element");
    }

}
