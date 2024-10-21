package OOPs.Encapsulation;

public class Person {
    // Private fields (encapsulated data)
    private String name;
    private int age;

    // Constructor to initialize fields
    public Person(String name, int age) {
        this.name = name;
        setAge(age);  // Using setter method to set the age with validation
    }

    // Getter for name (provides controlled access to the private field)
    public String getName() {
        return name;
    }

    // Setter for name (allows controlled modification of the private field)
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age with validation (controls the value being set)
    public void setAge(int age) {
        if (age > 0) {  // Validating that age is positive
            this.age = age;
        } else {
            System.out.println("Invalid age. Age must be positive.");
        }
    }

    // Method to display details
    public void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Creating a new Person object
        Person person = new Person("Alice", 25);

        // Accessing and displaying encapsulated data using public methods
        person.displayPersonDetails();  // Output: Name: Alice, Age: 25

        // Trying to set an invalid age
        person.setAge(-5);  // Output: Invalid age. Age must be positive.

        // Changing the name using setter method
        person.setName("Bob");

        // Accessing and displaying updated encapsulated data
        System.out.println("Updated Name: " + person.getName());  // Output: Updated Name: Bob
        System.out.println("Age: " + person.getAge());            // Output: Age: 25
    }
}

