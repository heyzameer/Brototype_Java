package Patterns;

public class PyramidNumP7 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {
            int num = i+1;
            for (int j = 0; j < n -i; j++) {
                System.out.print("  ");
            }

            for (int j = 0; j <=i; j++) {
                System.out.print(num+" ");
                num++;
            }
            num--;
            for (int j = 1; j <=i; j++) {
                num--;
                System.out.print(num+" ");

            }

            System.out.println();
        }
    }
}
