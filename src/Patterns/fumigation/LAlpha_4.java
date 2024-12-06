package Patterns.fumigation;

public class LAlpha_4 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            char ch = 'A';
            for (int j = 1; j <= i; j++) {
                if (j%2==0) {
                    System.out.print(j);
                }else {
                    System.out.print(ch);
                }
                ch++;
            }
            System.out.println();

        }
    }
}
