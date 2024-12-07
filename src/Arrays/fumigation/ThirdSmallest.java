package Arrays.fumigation;

public class ThirdSmallest {
    public static void main(String[] args) {
        int smallest = Integer.MAX_VALUE;
        int secSmallest = Integer.MAX_VALUE;
        int thirSmallest = Integer.MAX_VALUE;

        int[] array = {1, 2, 3, 4, 5, 6, 7};

        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                thirSmallest = secSmallest;
                secSmallest = smallest;
                smallest = array[i];
            } else if (array[i] < secSmallest && array[i] != smallest) {
                thirSmallest = secSmallest;
                secSmallest = array[i];
            } else if (array[i] < thirSmallest && array[i] != secSmallest && array[i] != smallest) {
                thirSmallest = array[i];
            }
        }

        if (thirSmallest == Integer.MAX_VALUE) {
            System.out.println("There is no third smallest element.");
        } else {
            System.out.println("Smallest: " + smallest);
            System.out.println("Second Smallest: " + secSmallest);
            System.out.println("Third Smallest: " + thirSmallest);
        }
    }
}
