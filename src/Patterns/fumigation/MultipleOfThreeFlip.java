package Patterns.fumigation;

public class MultipleOfThreeFlip {
    public static void main(String[] args) {
        int n = 4;
        for (int i = n; i >= 1; i--) {
            for (int j = 0; j < i*3; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
