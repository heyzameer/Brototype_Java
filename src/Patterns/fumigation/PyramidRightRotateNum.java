package Patterns.fumigation;

public class PyramidRightRotateNum {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 0; i <= n*2-1; i++) {
            int stars = (i<n)? i*2+1 :  (n * 2 -1 )- (i-n+1) * 2;
            int num = 0;
            for (int j = 0; j < stars; j++) {

                if(j==0||j==stars-1){
                System.out.print("* ");
                }else{
                    System.out.print(num+" ");
                }

                if(j<stars/2){
                    num++;
                }else{
                    num--;
                }

            }
            System.out.println();
        }
    }
}
