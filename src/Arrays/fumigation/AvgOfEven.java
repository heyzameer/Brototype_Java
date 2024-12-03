package Arrays.fumigation;

public class AvgOfEven {
    public static void main(String[] args) {
        int[] array = {2,6,23,65,8};
        float avg = 0;
        int sum = 0;
        int n = array.length;
        for (int j : array) {
            if (j % 2 == 0) {
                sum = sum + j;
            }
        }
        avg = (float) sum / n;
        System.out.println("Avg of all element is:"+avg);
    }

}
