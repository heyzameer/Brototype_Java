package Patterns.fumigation;

public class LFLipTriangle {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }


//        int n = 5;
//        for (int i = 0; i < n; i++) {
//
//            for (int j = 0; j < n; j++) {
//                if(j >= 5 - i){
//                    System.out.print("*");
//                } else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
    }

}