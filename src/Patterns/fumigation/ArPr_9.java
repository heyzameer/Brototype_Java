package Patterns.fumigation;

public class ArPr_9 {
    public static void main(String[] args) {

        int n = 3;
        String ch = "* ";
        System.out.println("*");
        for (int i = 1; i <=n; i++) {
            for (int j = 0; j < i; j++) {
                for (int k = 0; k < i; k++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            if(i!=3) {
                System.out.println(String.valueOf(ch).repeat(i * 3));
            }
            }
    }
}