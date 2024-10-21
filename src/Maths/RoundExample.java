package Maths;

public class RoundExample {
    public static void main(String[] args) {
        // Numbers to round
        double number1 = 7.6589;
        double number2 = 5.123456;
        double number3 = 3.14159;

        // Rounding using the roundTo method
        System.out.println("Original number: " + number1 + " | Rounded to 2 decimal places: " + roundTo(number1, 2)); // 7.66
        System.out.println("Original number: " + number2 + " | Rounded to 3 decimal places: " + roundTo(number2, 3)); // 5.123
        System.out.println("Original number: " + number3 + " | Rounded to 4 decimal places: " + roundTo(number3, 4)); // 3.1416

        // Example of rounding directly to 2 decimal places
        double roundedNumber = Math.round(number1 * 100.0) / 100.0; // Rounding number1 to 2 decimal places
        System.out.println("Original number: " + number1 + " | Rounded to 2 decimal places (direct method): " + roundedNumber); // 7.66
    }

    // Method to round a number to a specified number of decimal places
    public static double roundTo(double value, int decimalPlaces) {
        double scale = Math.pow(10, decimalPlaces); // 10^decimalPlaces
        return Math.round(value * scale) / scale; // Round and return
    }
}

