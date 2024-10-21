package Strings;
import java.text.SimpleDateFormat;
import java.util.Date;
public class FormateDate {


        public static void main(String[] args) {
            // Sample inputs
            int largeInteger = 123456789; // You can modify this value
            double floatingPointNumber = 3.14159; // You can modify this value

            // Format and print a large integer with commas
            String formattedInteger = String.format("Formatted integer: %,d", largeInteger);
            System.out.println(formattedInteger);  // Output: Formatted integer: 123,456,789

            // Format and print a floating-point number with 2 decimal places
            String formattedPi = String.format("Formatted Pi: %.2f", floatingPointNumber);
            System.out.println(formattedPi);  // Output: Formatted Pi: 3.14

            // Format and print the current date in the format "Day, Month Date Year"
            Date date = new Date(); // Get the current date
            SimpleDateFormat sdf = new SimpleDateFormat("E, MMM dd yyyy");
            String formattedDate = sdf.format(date);
            System.out.println("Date: " + formattedDate);  // Output: Date: Tue, Sep 26 2024 (or current date)
        }



}
