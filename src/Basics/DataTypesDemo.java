package Basics;

import java.util.Scanner;

public class DataTypesDemo {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // byte (8-bit integer)
        System.out.println("Enter a byte value (-128 to 127): ");
        byte byteValue = scanner.nextByte();
        System.out.println("Byte value: " + byteValue);

        // short (16-bit integer)
        System.out.println("Enter a short value (-32,768 to 32,767): ");
        short shortValue = scanner.nextShort();
        System.out.println("Short value: " + shortValue);

        // int (32-bit integer)
        System.out.println("Enter an int value (-2^31 to 2^31-1): ");
        int intValue = scanner.nextInt();
        System.out.println("Int value: " + intValue);

        // long (64-bit integer)
        System.out.println("Enter a long value (-2^63 to 2^63-1): ");
        long longValue = scanner.nextLong();
        System.out.println("Long value: " + longValue);

        // float (32-bit floating-point)
        System.out.println("Enter a float value (decimal number): ");
        float floatValue = scanner.nextFloat();
        System.out.println("Float value: " + floatValue);

        // double (64-bit floating-point)
        System.out.println("Enter a double value (decimal number): ");
        double doubleValue = scanner.nextDouble();
        System.out.println("Double value: " + doubleValue);

        // char (16-bit Unicode character)
        System.out.println("Enter a character: ");
        char charValue = scanner.next().charAt(0);  // Reading first character of the input
        System.out.println("Char value: " + charValue);

        // boolean (true/false)
        System.out.println("Enter a boolean value (true or false): ");
        boolean booleanValue = scanner.nextBoolean();
        System.out.println("Boolean value: " + booleanValue);

        // Close the scanner
        scanner.close();
    }
}