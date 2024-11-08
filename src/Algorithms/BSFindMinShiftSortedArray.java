package Algorithms;
import java.util.Scanner;
public class BSFindMinShiftSortedArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Ask user for input array
        String[] input = scanner.nextLine().split("\\s+");
        int[] nums = new int[input.length];
        for(int i = 0; i < input.length; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }
        // Find the minimum element using Binary Search
        int minElement = findMin(nums);
        // Print the minimum element
        System.out.println("The minimum element is " + minElement + ".");
        scanner.close();
    }

    public static int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        // If the array is not rotated
        if(nums[left] <= nums[right]) {
            return nums[left];
        }
        while(left <= right) {
            int mid = left + (right - left) / 2;
            // Check if mid element is minimum
            if(mid > 0 && nums[mid] < nums[mid - 1]) {
                return nums[mid];
            }
            // Check if mid+1 element is minimum
            if(mid < nums.length - 1 && nums[mid] > nums[mid + 1]) {
                return nums[mid + 1];
            }
            // Decide which side to go
            if(nums[mid] >= nums[left]) {
                // Left part is sorted, pivot is in right part
                left = mid + 1;
            } else {
                // Right part is sorted, pivot is in left part
                right = mid - 1;
            }
        }
        return nums[0]; // Fallback
    }
}