package Arrays.fumigation;

public class SecondSmallest {
    public static void main(String[] args) {
        int smallest = Integer.MAX_VALUE;
        int secSmallest = Integer.MAX_VALUE;
        int[] array = {1,34,6,56,61,9,7};

        for (int i = 0; i < array.length; i++) {
            if (array[i]<smallest){
                secSmallest = smallest;
                smallest = array[i];
            }else if (array[i]<secSmallest && smallest!= array[i] ) {
                secSmallest = array[i];
            }
        }

        System.out.println("Second Smallest is: "+secSmallest);
    }
}
