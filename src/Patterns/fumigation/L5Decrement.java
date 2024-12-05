package Patterns.fumigation;

public class L5Decrement {
    public static void main(String[] args) {
        int n = 4;
        int num = 50;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print(num+" ");
                num -=5;
            }
            System.out.println();
        }
    }
}
