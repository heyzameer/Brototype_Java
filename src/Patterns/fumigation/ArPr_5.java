package Patterns.fumigation;

public class ArPr_5 {
    public static void main(String[] args) {
        int n =6;
        for (int i = 0; i <n/2  ; i++) {
            for (int j = 0; j <n-i*2; j++) {
                System.out.print("X");
            }
            System.out.println();
            System.out.print("X");
            System.out.println();
        }
    }
}
