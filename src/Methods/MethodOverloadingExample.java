//Method overriding in Java is a feature that allows a subclass to provide a specific implementation of a method that is already defined in its superclass. When a method in a subclass has the same name, return type, and parameters as a method in its superclass, it is said to override the method of the superclass. This allows for runtime polymorphism, where the method that gets called is determined at runtime based on the object being referenced.
//
//Key Points about Method Overriding:
//Same Name and Parameters: The overridden method must have the same name and parameters as the method in the superclass.
//Return Type: The return type must be the same or a subtype (covariant return type) of the return type of the method in the superclass.
//Access Modifier: The access modifier of the overriding method cannot be more restrictive than that of the overridden method.
//Runtime Polymorphism: Method overriding enables runtime polymorphism, where the method to be called is determined at runtime based on the object's actual type.
package Methods;

public class MethodOverloadingExample {

    // Method to add two integers
    public static int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two double values
    public static double add(double a, double b) {
        return a + b;
    }

    // Main method to test the overloaded methods
    public static void main(String[] args) {
        int sum1 = add(10, 20); // Calls the first add method
        int sum2 = add(10, 20, 30); // Calls the second add method
        double sum3 = add(10.5, 20.5); // Calls the third add method

        System.out.println("Sum of two integers: " + sum1); // Output: Sum of two integers: 30
        System.out.println("Sum of three integers: " + sum2); // Output: Sum of three integers: 60
        System.out.println("Sum of two doubles: " + sum3); // Output: Sum of two doubles: 31.0
    }
}
