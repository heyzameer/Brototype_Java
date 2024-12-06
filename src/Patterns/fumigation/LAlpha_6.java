package Patterns.fumigation;

public class LAlpha_6 {
    public static void main(String[] args) {
        char ch = 'A';
        int n = 7;
        int num = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i ; j++) {
                if (i%2==0) {
                    System.out.print(ch);
                }else{
                    System.out.print(num);

                }
            }
            System.out.println();
            if (i%2==0){
                ch++;
            }else{
                num++;
            }
        }
    }
}
