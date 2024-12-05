package OOPs.Inheritance;

// Interface
interface Animal {
    void sound();  // Method signature only (no body)
}

// Class implementing the Animal interface
class Dog2 implements Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class InterfaceMain {
    public static void main(String[] args) {
        Dog2 dog = new Dog2();
        dog.sound();  // Calls the method in Dog class that implements the Animal interface
    }
}
