package Arrays.fumigation;

import java.util.Scanner;
public class FinndSum {


        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Hello, World!");
            int sum = 0;
            int[] array = new int[]{2,4,6,7,8};
            for(int i = 0; i < array.length; i++){

                sum = sum +array[i];

            }
            System.out.println("sum is "+sum);
        }
    }

