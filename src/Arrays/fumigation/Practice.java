package Arrays.fumigation;
import java.util.Arrays;

import static Arrays.fumigation.PrimeNxtDelete2_2.isPrime;

public class Practice {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        int n = array.length;

        for (int i = 0; i < n; i++) {
            if(isPrime(array[i])) {
                int k = 0;
                int index = i + 1;
                while (k < 2 && index < n){
                    for (int j = index; j < n - 1; j++) {
                        array[j] = array[j + 1];
                    }
                    k++;
                    n--;
            }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }

    }

}
