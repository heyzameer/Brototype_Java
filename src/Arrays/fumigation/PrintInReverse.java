package Arrays.fumigation;

public class PrintInReverse {
    public static void main(String[] args) {
        int[] array = new int[]{1,45,76,34,54};

        for (int i = array.length -1; i >= 0 ; i--) {
                System.out.print(array[i]);
            }
        }
}
