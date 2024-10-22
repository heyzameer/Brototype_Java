package Patterns;

public class PiramidInverted {
    public static void main(String[] args) {

        int n = 5;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < (n * 2 -1 )- i * 2 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
