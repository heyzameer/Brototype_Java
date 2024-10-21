package Strings;
    import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeExample {
        public static void main(String[] args) {
            // Example of LocalDate
            LocalDate today = LocalDate.now();
            System.out.println("Today's Date: " + today); // Output: Today's Date: YYYY-MM-DD

            // Example of LocalTime
            LocalTime now = LocalTime.now();
            System.out.println("Current Time: " + now); // Output: Current Time: HH:MM:SS.sss

            // Example of LocalDateTime
            LocalDateTime dateTimeNow = LocalDateTime.now();
            System.out.println("Current Date and Time: " + dateTimeNow); // Output: Current Date and Time: YYYY-MM-DDTHH:MM:SS.sss

            // Formatting LocalDate
            DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            String formattedDate = today.format(dateFormatter);
            System.out.println("Formatted Date: " + formattedDate); // Output: Formatted Date: DD-MM-YYYY

            // Formatting LocalTime
            DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh:mm a");
            String formattedTime = now.format(timeFormatter);
            System.out.println("Formatted Time: " + formattedTime); // Output: Formatted Time: HH:MM AM/PM

            // Formatting LocalDateTime
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            String formattedDateTime = dateTimeNow.format(dateTimeFormatter);
            System.out.println("Formatted Date and Time: " + formattedDateTime); // Output: Formatted Date and Time: DD/MM/YYYY HH:MM:SS
        }


}
