package Patterns.fumigation;

public class ArPr_3 {
    public static void main(String[] args) {
        int n =3;
        for (int i = 1; i <=n ; i++) {
            for (int j = 0; j < i*2; j++) {
                System.out.print("* ");
            }
            System.out.println();
            for (int j = 0; j < i; j++) {
                System.out.println("*");
            }
        }
    }
}
