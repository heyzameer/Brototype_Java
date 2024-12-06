package Patterns.fumigation;

public class LAlpha_3 {
    public static void main(String[] args) {
        int n = 5;
        char ch = 'A';
        int num = 1;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j <= i; j++) {
                if(i%2==0){
                System.out.print(ch);
                 }else{
                    System.out.print(num);
                }
            }
            if(i%2==0){
                ch++;
            }else{
                num ++;
            }
            System.out.println();
        }
    }
}
