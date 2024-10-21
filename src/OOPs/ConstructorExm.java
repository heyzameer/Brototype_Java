

package OOPs;
//A constructor in Java is a special method used to initialize objects. It is called when an instance of a class is created. Constructors have the same name as the class and no return type, not even void. Java provides a default constructor if you don't define one, but you can create custom constructors as well.
//
//Key Points:
//Constructor Name: Must be the same as the class name.
//No Return Type: Constructors do not have a return type, not even void.
//Purpose: Initializes the object's state (its fields or attributes).
//Overloading: Constructors can be overloaded, meaning a class can have more than one constructor, each with different parameters.
//Default Constructor: If no constructor is defined, Java provides a default constructor with no parameters.
//Types of Constructors:
//Default Constructor: A constructor that takes no parameters.
//Parameterized Constructor: A constructor that takes arguments to initialize fields.
//In Java, the this keyword is a reference variable that refers to the current object within an instance method or constructor. It is commonly used to distinguish between instance variables and parameters when they have the same name, and it can also be used to pass the current object as a parameter to other methods or constructors.
public class ConstructorExm {
    String brand;
    String model;

    // Default constructor
    public ConstructorExm() {
        this.brand = "Unknown";
        this.model = "Unknown";
    }

    // Constructor with one argument
    public ConstructorExm(String brand) {
        this.brand = brand;
        this.model = "Unknown";  // Default value for model
    }

    // Constructor with two arguments
    public ConstructorExm(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void display() {
        System.out.println("Brand: " + brand + ", Model: " + model);
    }

    public static void main(String[] args) {
        // Using default constructor
        ConstructorExm car1 = new ConstructorExm();
        car1.display();  // Output: Brand: Unknown, Model: Unknown

        // Using constructor with one argument
        ConstructorExm car2 = new ConstructorExm("Tesla");
        car2.display();  // Output: Brand: Tesla, Model: Unknown

        // Using constructor with two arguments
        ConstructorExm car3 = new ConstructorExm("Tesla", "Model S");
        car3.display();  // Output: Brand: Tesla, Model: Model S
    }
}
