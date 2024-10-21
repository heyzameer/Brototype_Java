package Basics;

public class TypeCastingExample {
    public static void main(String[] args) {
        // Implicit casting (Widening)
        char letter = 'A';
        int asciiValue = letter;  // char to int (ASCII value)
        System.out.println("ASCII value of 'A': " + asciiValue);

        // Explicit casting (Narrowing)
        int largeNum = 257;
        byte smallNum = (byte) largeNum; // int to byte (Narrowing)
        System.out.println("After casting int 257 to byte: " + smallNum); // Output will be -1 due to overflow
    }
}
