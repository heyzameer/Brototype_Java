package Patterns;

public class LAlphaTriangle_2 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {
            char ch = 'A';
            for (int j = 0; j <= i; j++) {
                ch = (char)('A' + j);
                System.out.print(ch);
            }
            System.out.println();
        }
    }

}
