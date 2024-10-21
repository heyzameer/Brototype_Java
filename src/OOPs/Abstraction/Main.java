package OOPs.Abstraction;

// Abstract class
abstract class Animals {
    // Abstract method (doesn't have a body)
    public abstract void sound();

    // Concrete method (has a body)
    public void sleep() {
        System.out.println("Animals is sleeping");
    }
}

// Subclass (inherits from Animals)
class Dog extends Animals {
    // Providing implementation of the abstract method
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();  // Create an object of Dog
        myDog.sound();          // Output: Dog barks
        myDog.sleep();          // Output: Animals is sleeping
    }
}

//Explanation:
//The Animals class is abstract and cannot be instantiated directly.
//It contains an abstract method sound(), which means the subclass (Dog) must provide an implementation.
//The sleep() method in the Animals class is a concrete method, so the Dog class can inherit it without providing a new implementation.
