package Patterns.fumigation;

public class Malayalam_2 {
    public static void main(String[] args) {
//        char[] array =  {'M', 'A', 'L', 'A', 'Y', 'A', 'L', 'A', 'M'};
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j <=i; j++) {
//                System.out.print(array[j]);
//            }
//            System.out.println();
//        }
        String word="MALAYALAM";
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.substring(0,i));
        }
    }
}
