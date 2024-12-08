package Arrays.fumigation;
import java.util.Arrays;
public class Practice {
    public static void main(String[] args) {
       int n = 5;
        for (int i = 0; i < n*2-1; i++) {
            int spaces = (i<n)?n-i:i-n+2;
            int stars = (i<n)?2*i+1:(2*n-1)-(i-n+1)*2;
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < stars; j++) {
                if(j==0||j==stars-1||i==4){
                System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
