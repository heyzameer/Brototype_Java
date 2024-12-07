package Arrays.fumigation;

public class ThirdLargest {
    public static void main(String[] args) {
        int largest = Integer.MIN_VALUE;
        int secLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;

        int[] array = {1, 2, 3, 4, 5, 6, 7};

        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest) {
                thirdLargest = secLargest;
                secLargest = largest;
                largest = array[i];
            } else if (array[i] > secLargest && array[i] != largest) {
                thirdLargest = secLargest;
                secLargest = array[i];
            } else if (array[i] > thirdLargest && array[i] != secLargest && array[i] != largest) {
                thirdLargest = array[i];
            }
        }

        if (thirdLargest == Integer.MIN_VALUE) {
            System.out.println("There is no third largest element.");
        } else {
            System.out.println("Largest: " + largest);
            System.out.println("Second Largest: " + secLargest);
            System.out.println("Third Largest: " + thirdLargest);
        }
    }
}
