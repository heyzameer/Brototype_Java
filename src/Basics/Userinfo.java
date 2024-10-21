package Basics;

import java.util.Scanner;

public class Userinfo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter User ID (byte): ");
        byte userId = scan.nextByte();
        System.out.print("Enter Age (short): ");
        short age = scan.nextShort();
        System.out.print("Enter Phone Number (int): ");
        int phoneNumber = scan.nextInt();
        System.out.print("Enter National ID (long): ");
        long nationalId = scan.nextLong();
        System.out.print("Enter Height in meters (float): ");
        float height = scan.nextFloat();
        System.out.print("Enter Weight (double): ");
        double weight = scan.nextDouble();
        System.out.print("Enter Gender (char): ");
        char gender = scan.next().charAt(0);
        System.out.print("Is Married (boolean): ");
        boolean isMarried = scan.nextBoolean();

        scan.nextLine();

        System.out.print("Enter Name (String): ");
        String name = scan.nextLine();
        System.out.println("\nCollected User Information:");
        System.out.println("User ID: " + userId);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("National ID: " + nationalId);
        System.out.println("Height: " + height + "meters");
        System.out.println("Weight: " + weight + "Kg");
        System.out.println("Gender: " + gender);
        System.out.println("Is Married: " + (isMarried ? "Yes" : "No"));
        System.out.println("Name: " + name);
    }
}