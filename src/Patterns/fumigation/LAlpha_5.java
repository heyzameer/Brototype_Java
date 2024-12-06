package Patterns.fumigation;

public class LAlpha_5 {
    public static void main(String[] args) {
        int n = 5;


        for (int i = 1; i <= n; i++) {
            char ch = 'A';
            int num = 1;
            for (int j = 1; j <=i ; j++) {
                if (j%2==0) {
                    System.out.print(num++);
                }else {
                    System.out.print(ch++);
                }
            }
            System.out.println();
        }
    }
}
