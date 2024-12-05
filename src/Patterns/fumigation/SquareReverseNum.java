package Patterns.fumigation;

public class SquareReverseNum {
    public static void main(String[] args) {
        int n =3;
        int num = 1;

        for (int i = 0; i < n; i++) {
            if(i%2==0){
                for (int j = 0; j < n; j++) {
                    System.out.print(num++);
                }
            }else{
                int j = num+n-1;
                for (int k = 0; k < n; k++) {
                    System.out.print(j--);
                }
                num +=n;
            }

            System.out.println();
        }

    }
}
