package Patterns.fumigation;

public class W_Pattern {
    public static void main(String[] args) {
        int n =5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(j==0||j==n-1){
                    System.out.print("* ");
                } else if ((j==n-i-1&&i>1)||(i==j&&i>1)) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
