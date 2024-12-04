package Patterns.fumigation;

public class LNum3Multiple {
    public static void main(String[] args) {
        int n = 5;
        int start =3;

//
//        for (int i = 1; i <= n; i++) {
//            int num = 3;
//             num = num*i;
//            for (int j = 0; j < i; j++) {
//                    System.out.print(num-- +" ");
//            }
//            System.out.println();
//        }

        // Outer loop for each row
        int pVal=0;
        for (int i = 1; i <= n; i++) {

            int current = start + pVal; // Start number for the current row
            pVal = start;
            start = current;
            int num = current;
            // Inner loop to print numbers
            for (int j = 0; j < i; j++) {
                System.out.print(num+ " ");
                num--;
            }

            // Move to the next line after each row
            System.out.println();

        }
        }
}
