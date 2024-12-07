package Patterns.fumigation;

public class ArPr_12 {
    public static void main(String[] args) {
        int[] stars ={2,1,5,2,2,8,3,3,11};
        for (int i = 0; i < stars.length; i++) {
            printStar(stars[i]);
        }
    }
    static void printStar(int num){
        for (int i = 0; i < num; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
