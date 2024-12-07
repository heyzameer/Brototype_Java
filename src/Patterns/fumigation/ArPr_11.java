package Patterns.fumigation;

public class ArPr_11 {
    public static void main(String[] args) {
        int n =3;
        String ch = "* ";
        for (int i = 0; i <= n; i++) {
            int star = n*(i+1)-1;
            System.out.println(String.valueOf(ch).repeat(star));
            if(i!=n) {
                for (int j = 0; j <= i; j++) {
                    for (int k = 0; k <= i; k++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
            }
        }
    }
}
