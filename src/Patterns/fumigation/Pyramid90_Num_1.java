package Patterns.fumigation;

public class Pyramid90_Num_1 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n*2; i++) {
            int stars = (i<n)? i:(2*n -i);
            for (int j = 0; j <stars ; j++) {
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
}
