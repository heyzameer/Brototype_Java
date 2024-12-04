package Arrays.fumigation;

public class SecondLargest {
    public static void main(String[] args) {
        int largest = 0;
        int secLargest = 0;
        int[] array = {1,34,6,56,61,9,7};

        for (int i = 0; i < array.length; i++) {
            if (array[i]>largest){
                secLargest = largest;
                largest = array[i];
            }else if (array[i]>secLargest && largest!= array[i] ) {
                secLargest = array[i];
            }
        }

        System.out.println("Second Largest is: "+secLargest);
    }
}
