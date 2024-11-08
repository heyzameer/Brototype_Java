package Algorithms;
import java.util.Scanner;

public class BSFindDuplicate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Ask user for input array

        String[] input = scanner.nextLine().split("\\s+");
        int[] nums = new int[input.length];
        for(int i = 0; i < input.length; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }
        // Find the duplicate number using Binary Search
        int duplicate = findDuplicate(nums);
        // Print the duplicate number
        System.out.println("The duplicate number is " + duplicate + ".");
        scanner.close();
    }

    public static int findDuplicate(int[] nums) {
        int n = nums.length - 1; // Since nums contains n+1 elements
        int left = 1;
        int right = n;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            int count = countRange(nums, left, mid);
            if(left == right) {
                if(count > 1) {
                    return left;
                } else {
                    break;
                }
            }
            if(count > (mid - left + 1)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return -1; // Should never reach here
    }

    public static int countRange(int[] nums, int left, int right) {
        int count = 0;
        for(int num : nums) {
            if(num >= left && num <= right) {
                count++;
            }
        }
        return count;
    }
}