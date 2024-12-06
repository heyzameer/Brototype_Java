package Patterns.fumigation;

public class Malayalam {

    public static void main(String[] args) {
            String word = "MALAYALAM";

            for (int i = 1; i <= word.length(); i++) {
                System.out.println(word.substring(0, i));
            }
        }
}
