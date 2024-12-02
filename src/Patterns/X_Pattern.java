package Patterns;

public class X_Pattern {

        public static void main(String[] args) {
            System.out.println("Hello, World!");
            int n = 5;
            for(int i = 0; i < n; i++){
                for(int k = 0; k < n; k++){

                    if( i == k|| k == n - i -1) {
                        System.out.print(" * ");
                    }else{

                        System.out.print("   ");
                    }

                }
                System.out.println();


        }
    }
}
