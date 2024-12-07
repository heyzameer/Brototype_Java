package Patterns.fumigation;

public class ArPr_2 {
    public static void main(String[] args) {
        int n = 7;
        for (int i = n; i >=1 ; i--) {
            for (int j = 0; j < i*2-1; j++) {
                System.out.print("* ");
            }
            System.out.println();
            for (int j = 0; j < 1; j++) {
                if (i!=1) {
                    System.out.print("* *");
                }
            }
            System.out.println();
        }


    }
}
