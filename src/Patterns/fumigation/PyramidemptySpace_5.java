package Patterns.fumigation;

public class PyramidemptySpace_5 {
    public static void main(String[] args) {
        int[] star ={4,3,2,1,2,3,4};
        int[] space ={1,3,5,7,5,3,1};
        int[] star2 ={4,3,2,1,2,3,4};

        System.out.println("*********");
        for (int i = 0; i < star.length; i++) {
            printStar(star[i]);
            printSpace(space[i]);
            printStar(star2[i]);
            System.out.println();
        }
        System.out.println("*********");
    }
    static void printStar(int num){
        for (int i = 0; i < num; i++) {
            System.out.print("*");
        }
    }
    static void printSpace(int num){
        for (int i = 0; i < num; i++) {
            System.out.print(" ");
        }
    }
}
