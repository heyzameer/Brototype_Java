package Patterns.fumigation;

public class MultipleOfThree {
        public static void main(String[] args) {
            int n = 4;
            for(int i = 1; i <= n; i++){
                for(int j = 1; j <= i * 3; j++){
                    System.out.print("*");
                }
                System.out.println(" ");

            }
        }
}