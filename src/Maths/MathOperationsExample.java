package Maths;

public class MathOperationsExample {
    public static void main(String[] args) {
        // 1. Basic Math Operations
        int a = 10;
        int b = 3;

        System.out.println("=== Basic Math Operations ===");
        System.out.println("Max of a and b: " + Math.max(a, b));  // 10
        System.out.println("Min of a and b: " + Math.min(a, b));  // 3
        System.out.println("Absolute value of -20: " + Math.abs(-20));  // 20
        System.out.println("2 raised to the power of 3: " + Math.pow(2, 3));  // 8.0
        System.out.println("Square root of 16: " + Math.sqrt(16));  // 4.0

        // 2. Rounding
        double num = 7.65;
        System.out.println("\n=== Rounding Operations ===");
        System.out.println("Round of 7.65: " + Math.round(num));  // 8
        System.out.println("Ceiling of 7.65: " + Math.ceil(num));  // 8.0
        System.out.println("Floor of 7.65: " + Math.floor(num));  // 7.0

        // 3. Trigonometric Functions
        double degrees = 45;
        double radians = Math.toRadians(degrees);  // Convert degrees to radians
        System.out.println("\n=== Trigonometric Functions ===");
        System.out.println("Sine of 45 degrees: " + Math.sin(radians));  // 0.7071067811865475
        System.out.println("Cosine of 45 degrees: " + Math.cos(radians));  // 0.7071067811865476
        System.out.println("Tangent of 45 degrees: " + Math.tan(radians));  // 0.9999999999999999

        // 4. Random Number Generation
        System.out.println("\n=== Random Number Generation ===");
        double random = Math.random();
        System.out.println("Random number between 0.0 and 1.0: " + random);
        int randomInRange = (int) (Math.random() * 100) + 1;  // Random number between 1 and 100
        System.out.println("Random number between 1 and 100: " + randomInRange);

        // 5. Exponentiation and Logarithms
        System.out.println("\n=== Exponentiation and Logarithms ===");
        double base = 2;
        double exponent = 3;
        System.out.println(base + " raised to the power of " + exponent + ": " + Math.pow(base, exponent));  // 8.0
        System.out.println("Natural log of 10: " + Math.log(10));  // 2.302585...
        System.out.println("Base 10 log of 100: " + Math.log10(100)); // 2.0
    }
}
