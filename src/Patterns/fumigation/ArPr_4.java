package Patterns.fumigation;

public class ArPr_4 {
    public static void main(String[] args) {
        int n =3;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i*3; j++) {
                System.out.print("*");
            }
            System.out.println();
            for (int j = 1; j <= 2; j++) {
                System.out.print("*");
                System.out.println();
            }
        }
    }
}
