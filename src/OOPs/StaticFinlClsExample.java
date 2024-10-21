package OOPs;


public class StaticFinlClsExample {
    // A public static final constant, can be accessed from anywhere
    public static final String COMPANY_NAME = "Tech Co.";

    // A non-static final variable (constant), initialized in the constructor
    public final int employeeId;

    // Constructor to initialize the final variable
    public StaticFinlClsExample(int id) {
        this.employeeId = id;
    }

    // A public static method
    public static void showCompanyName() {
        System.out.println(COMPANY_NAME); // Can directly access static variables
    }

    // A public final method that cannot be overridden
    public final void displayEmployeeId() {
        System.out.println("Employee ID: " + employeeId);
    }

    // Main method to test the class
    public static void main(String[] args) {
        StaticFinlClsExample e1 = new StaticFinlClsExample(101);
        StaticFinlClsExample.showCompanyName(); // Accessing static method

        e1.displayEmployeeId(); // Accessing non-static method via object
    }
}
