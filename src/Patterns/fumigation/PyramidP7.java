package Patterns.fumigation;

public class PyramidP7 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("  ");
            }
            int num = i+1;
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print(num+" ");
                if(j<i){
                    num++;
                }else{
                    num--;
                }
            }
            System.out.println();
        }
    }
}
