package Strings;
    import java.util.Scanner;

    public class StringOperations {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input student names and course titles
            System.out.print("Enter the first name: ");
            String firstName = scanner.nextLine();
            System.out.print("Enter the last name: ");
            String lastName = scanner.nextLine();
            System.out.print("Enter course title: ");
            String courseTitle = scanner.nextLine();

            // 1. Concatenation: Joining names
            String fullName = firstName + " " + lastName;
            System.out.println("Full Name (Concatenation): " + fullName);
            String courseDetail = fullName.concat(" - ").concat(courseTitle);
            System.out.println("Course Detail: " + courseDetail);

            // 2. Length: Finding the length of the full name
            System.out.println("Full Name Length: " + fullName.length());

            // 3. charAt: Accessing the first character of the first name
            char firstInitial = firstName.charAt(0);
            System.out.println("First Initial (charAt): " + firstInitial);

            // 4. Substring: Extracting initials from the full name
            String initials = firstName.substring(0, 1) + lastName.substring(0, 1);
            System.out.println("Initials (Substring): " + initials);

            // 5. Comparing Strings: Checking if two names are the same
            System.out.print("Enter another name to compare: ");
            String anotherName = scanner.nextLine();
            if (fullName.equals(anotherName)) {
                System.out.println("Names are equal.");
            } else {
                System.out.println("Names are not equal.");
            }

            // 6. Changing Case: Converting the course title to uppercase
            String upperCourseTitle = courseTitle.toUpperCase();
            System.out.println("Course Title (Uppercase): " + upperCourseTitle);

            // 7. Trimming: Removing extra spaces from a name
            System.out.print("Enter a name with extra spaces: ");
            String nameWithSpaces = scanner.nextLine();
            String trimmedName = nameWithSpaces.trim();
            System.out.println("Trimmed Name: '" + trimmedName + "'");

            scanner.close();
        }
    }


