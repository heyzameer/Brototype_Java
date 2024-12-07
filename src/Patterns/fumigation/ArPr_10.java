package Patterns.fumigation;

public class ArPr_10 {
    public static void main(String[] args) {
        int n =3;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3+i; j++) {
                System.out.print("*");
            }
            System.out.println();
            if(i!=n-1) {
                for (int j = 0; j < 3 * (i + 1); j++) {
                    System.out.print("*");
                    System.out.println();
                }
            }
        }
    }
}
