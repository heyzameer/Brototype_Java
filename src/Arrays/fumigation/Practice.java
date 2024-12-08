package Arrays.fumigation;
import java.util.Arrays;
public class Practice {
    public static void main(String[] args) {
        int[] array ={1,2,3,4,5,6,7};
        int[] freq = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            if (freq[i]!=0) {
                continue;
            }

            int count = 1;
            for (int j = i+1; j < array.length ; j++) {
                if (array[i] == array[j]) {
                    freq[j]= -1;
                    count++;
                }
            }
            freq[i]=count;
        }
        System.out.println(Arrays.toString(freq));
    }
}
