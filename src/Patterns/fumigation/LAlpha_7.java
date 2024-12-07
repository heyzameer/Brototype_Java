package Patterns.fumigation;

public class LAlpha_7 {
    public static void main(String[] args) {
        int n =6;
        int num = 1;
        char ch = 'B';
        for (int i = 1; i <=n ; i++) {
            for (int j = 0; j < i*2; j++) {
                if(i%2==0){
                    System.out.print(ch);
                }else {
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
