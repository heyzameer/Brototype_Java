package Patterns;

public class PyramidNumb {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {
            int num = 1;
            for (int j = 0; j < n -i; j++) {
                System.out.print("  ");
            }

            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print(num + " ");
                num++;
            }

            System.out.println();
        }
    }
}
