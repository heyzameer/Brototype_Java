package Basics;

import java.util.Scanner;

public class practicer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter int");
        int num = scan.nextInt();

        System.out.println("enetr char");
        char ch = scan.next().charAt(1);
        System.out.println(ch);
    starting();
    }
    static void starting(){
        System.out.println("hello");
    }
}
