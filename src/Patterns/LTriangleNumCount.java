package Patterns;

public class LTriangleNumCount {
    public static void main(String[] args) {
        int n = 5;
        int count =1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(count++);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}