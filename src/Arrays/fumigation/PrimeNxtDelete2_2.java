package Arrays.fumigation;

import java.util.Arrays;

public class PrimeNxtDelete2_2 {
//    public static void main(String[] args) {
//        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 3, 10};
//        int n = array.length; // Current array size
//
//        for (int i = 0; i < n; i++) {
//            if (isPrime(array[i])) {
//                int k = 0; // Counter for number of deletions
//                int index = i + 1; // Start deleting from the next element
//
//                while (k < 2 && index < n) { // Delete up to 2 elements
//                    for (int j = index; j < n - 1; j++) {
//                        array[j] = array[j + 1]; // Shift elements to the left
//                    }
//                    n--; // Reduce the size of the array
//                    k++; // Increment deletion count
//                }
//            }
//        }
//
//        // Print the resulting array
//        System.out.println("Modified Array: " + Arrays.toString(Arrays.copyOf(array, n)));
//    }
//
//    // Helper function to check if a number is prime
//    public static boolean isPrime(int num) {
//        if (num <= 1) {
//            return false; // 0 and 1 are not prime numbers
//        }
//        if (num == 2) {
//            return true; // 2 is the only even prime number
//        }
//        if (num % 2 == 0) {
//            return false; // Exclude all other even numbers
//        }
//        for (int i = 3; i <= Math.sqrt(num); i += 2) {
//            if (num % i == 0) {
//                return false; // Found a factor
//            }
//        }
//        return true; // No factors found
//    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        int n = array.length;

        for (int i = 0; i < n; i++) {
            if (isPrime(array[i])){
                int index = i+1;
                int k =0;

                while(index < n && k<2){
                    for (int j = index; j <n-1 ; j++) {
                        //System.out.println("for 2");
                        array[j] = array[j+1];
                    }
                    k++;
                    n--;
                }
            }
        }
       // System.out.println("for 1");
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }
    }

    public static boolean isPrime(int num){
        if(num <=1){
            return false;
        }
        if(num ==2){
            return true;
        }
        if(num%2==0){
            return false;
        }
        for (int i = 3; i <Math.sqrt(num) ; i+=2) {
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
