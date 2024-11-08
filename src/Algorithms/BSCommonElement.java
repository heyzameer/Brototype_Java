package Algorithms;
import java.util.*;

public class BSCommonElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for input arrays

        String[] input1 = scanner.nextLine().split("\\s+");
        int[] nums1 = new int[input1.length];
        for(int i = 0; i < input1.length; i++) {
            nums1[i] = Integer.parseInt(input1[i]);
        }

        String[] input2 = scanner.nextLine().split("\\s+");
        int[] nums2 = new int[input2.length];
        for(int i = 0; i < input2.length; i++) {
            nums2[i] = Integer.parseInt(input2[i]);
        }

        // Find the intersection using Binary Search
        int[] intersection = intersect(nums1, nums2);

        // Print the result
        System.out.println("The intersection is: " + Arrays.toString(intersection));
        scanner.close();
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        // Use a set to store unique elements
        Set<Integer> resultSet = new HashSet<>();

        // Sort both arrays
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        // Iterate over the smaller array and use Binary Search on the larger array
        if(nums1.length > nums2.length) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }

        for(int num : nums1) {
            if(binarySearch(nums2, num)) {
                resultSet.add(num);
            }
        }

        // Convert set to array
        int[] result = new int[resultSet.size()];
        int i = 0;
        for(int num : resultSet) {
            result[i++] = num;
        }

        return result;
    }

    public static boolean binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length -1;
        while(left <= right) {
            int mid = left + (right - left)/2;
            if(nums[mid] == target) {
                return true;
            } else if(nums[mid] < target) {
                left = mid +1;
            } else {
                right = mid -1;
            }
        }
        return false;
    }
}