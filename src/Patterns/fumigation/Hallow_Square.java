package Patterns.fumigation;

public class Hallow_Square {
        public static void main(String[] args) {
            System.out.println("Hello, World!");
            int n = 5;
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){

                    if( i == 0|| i == n-1|| j==0||j==n-1) {
                        System.out.print("*");
                    }else{

                        System.out.print(" ");
                    }

                }
                System.out.println();

            }
        }

}
