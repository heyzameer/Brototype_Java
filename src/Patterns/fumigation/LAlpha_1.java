package Patterns.fumigation;

public class LAlpha_1 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            char ch = 'A';
            for (int j = 0; j < i; j++) {
                System.out.print(ch++ + " ");
            }
            System.out.println();
        }
    }
}
