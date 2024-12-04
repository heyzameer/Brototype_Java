package Patterns.fumigation;

public class PyramidNumIncrement {
    public static void main(String[] args) {
        int n = 4;
        int num = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n -i; j++) {
                System.out.print("   ");
            }
            for (int j = 0; j < 2*i+1; j++) {
                if(num<10) {
                    System.out.print(num+"  ");
                }else{
                    System.out.print(num+" ");
                }
                num++;
            }
            System.out.println();
        }
    }
}
