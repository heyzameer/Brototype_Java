package Patterns;

public class PyramidHallow {

    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - i; j++) {
                System.out.print("  ");
            }

            for (int j = 0; j < i * 2 + 1; j++) {
                if( j==0||i==n-1||j==(i*2+1)-1) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}

