package Patterns.fumigation;

public class KiteNum {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n*2-1; i++) {
            int spaces = (i<n)? (n-i):(i-n+2);
            int stars =(i<n)? (2*i+1): (n*2-1)-(i-n+1)*2;
            for (int j = 1; j <spaces ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < stars; j++) {
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
}
