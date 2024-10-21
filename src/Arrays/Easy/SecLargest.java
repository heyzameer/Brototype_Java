package Arrays.Easy;

public class SecLargest {
    public static void main(String[] args) {
        int[] array = {1,7,3,4,5,6};

        int largest = 0;
        int secLargest = 0;

        for (int i = 0; i <= array.length - 1 ; i++) {
            if(array[i] > largest){
                secLargest = largest;
                largest = array[i];

            } else if (secLargest < array[i] && largest != array[i]) {
                secLargest = array[i];
            }
        }

        System.out.println("Largest : " + largest);
        System.out.println("Second Largest : " + secLargest);
    }
}
