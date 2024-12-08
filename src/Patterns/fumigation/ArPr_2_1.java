package Patterns.fumigation;

public class ArPr_2_1 {
    public static void main(String[] args) {
        int n =13;
        int k=0;
        for (int i = n; i >= 1; i--) {
            k =(i % 2 != 0) ? (k = i) : (k = 2);
            for (int j = 0; j < k; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

//     *
//    *  *
//   *  *  *
// *  *  *  *
//*  *  *  *  *
